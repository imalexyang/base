package cn.bishiti.base.test.rpc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RpcServer {
	
	int port;
	RpcHandler handler;
	
	public RpcServer(int port,RpcHandler handler){
		this.port=port;
		this.handler=handler;
	}
	
	ExecutorService executerService=Executors.newFixedThreadPool(20);
	
	public void start(){
		try{
			ServerSocket serverSocket=new ServerSocket(port);
			while(true){
				Socket socket=serverSocket.accept();
				executerService.submit(new WorkThread(socket));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public class WorkThread implements Runnable{

		Socket socket;
		
		WorkThread(Socket socket){
			this.socket=socket;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try{
				InputStream inputStream = socket.getInputStream();
	            OutputStream outputStream = socket.getOutputStream();
	            while (true) {
	                int magic = inputStream.read();
	                //魔数
	                if (magic == 0x5A) {
	                    //两个字节用来计算长度数据长度，服务传送的数据过大可能会出现截断问题
	                    int length1 = inputStream.read();
	                    int length2 = inputStream.read();
	                    int length = (length1 << 8) + length2;
	                    ByteArrayOutputStream bout = new ByteArrayOutputStream(length);
	                    int sum = 0;
	                    byte[] bs = new byte[length];
	                    while (true) {
	                        int readLength = inputStream.read(bs, 0, length - sum);
	                        if (readLength > 0) {
	                            bout.write(bs, 0, readLength);
	                            sum += readLength;
	                        }
	                        if (sum >= length) {
	                            break;
	                        }
	                    }
	                    ObjectInputStream objectInputStream = new ObjectInputStream(
	                        new ByteArrayInputStream(bout.toByteArray()));
	                    try {
	                        RpcCommand commond = (RpcCommand) objectInputStream.readObject();
	                        RpcResponse response = handler.handler(commond);
	                        ByteArrayOutputStream objectout = new ByteArrayOutputStream(length);
	                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(objectout);
	                        objectOutputStream.writeObject(response);
	                        objectOutputStream.flush();
	                        byte[] commondBytes = objectout.toByteArray();
	                        int len = commondBytes.length;
	                        outputStream.write(0x5A);
	                        outputStream.write(len >> 8);
	                        outputStream.write(len & 0x00FF);
	                        outputStream.write(commondBytes);
	                        outputStream.flush();
	                    } catch (Exception e) {
	                        e.printStackTrace();
	                    }
	                }
	            }
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("和客户端连接断开了");
			}finally{
				if(socket ==null){
					try{
						socket.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}

	}
	
	public static void main(String args[]){
		RpcHandler rpcHandler=new RpcHandler();
		rpcHandler.regist(IDemoInterface.class, new IDemoImpl());
		RpcServer server = new RpcServer(8081,rpcHandler);
	}
}
