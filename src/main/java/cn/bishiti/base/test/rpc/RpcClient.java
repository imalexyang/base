package cn.bishiti.base.test.rpc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class RpcClient {
	
	String       host;
    int          port;
	Socket       socket;
	InputStream  inputStream;
	OutputStream outputStream;
	
	public RpcClient(String host, int port) {
	 	try {
            socket = new Socket();
            socket.connect(new InetSocketAddress(host, port));
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	 
	//这个不能并发请求，否则会出现数据流乱的情况
    public synchronized RpcResponse invoke(RpcCommand commond) {
        RpcResponse response = new RpcResponse();
        try {
            ByteArrayOutputStream objectout = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(objectout);
            objectOutputStream.writeObject(commond);
            objectOutputStream.flush();
            byte[] commondBytes = objectout.toByteArray();
            outputStream.write(0x5A);
            int len = commondBytes.length;

            outputStream.write(len >> 8);
            outputStream.write(0x00FF & len);
            outputStream.write(commondBytes);
            outputStream.flush();
            while (true) {
                int magic = inputStream.read();
                if (magic == 0x5A) {
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
                    RpcResponse response1 = (RpcResponse) objectInputStream.readObject();
                    return response1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return response;
    }
    
    public static void main(String args[]){
    	RpcClient client = new RpcClient("localhost", 8081);
    	RpcCommand command = new RpcCommand();
    	command.setClassName(IDemoInterface.class.getName());
        command.setMethodName("noArgument");
        command.setArgumetsType(new String[0]);
        RpcResponse response = client.invoke(command);
        
        RpcCommand command2 = new RpcCommand();
        command2.setClassName(IDemoInterface.class.getName());
        command2.setMethodName("withReturn");
        command2.setArgumetsType(new String[] { "java.lang.String" });
        command2.setParams(new String[] { "shocklee" });
        RpcResponse response2 = client.invoke(command2);
        System.out.println(response.getResult());
        System.out.println(response2.getResult());
    }
}
