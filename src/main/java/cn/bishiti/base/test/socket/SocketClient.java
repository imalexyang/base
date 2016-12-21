package cn.bishiti.base.test.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
	
	public static void main(String args[]){
		try{
			Socket socket=new Socket("127.0.0.1",2017);
			
			socket.setSoTimeout(60000);
			
			PrintWriter printWriter=new PrintWriter(socket.getOutputStream(),true);
			
			BufferedReader sysBuffer=new BufferedReader(new InputStreamReader(System.in));
			
			printWriter.println(sysBuffer.readLine());
			
			printWriter.flush();
			
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String result=bufferedReader.readLine();
			
			System.out.println("server say:"+result);
			
			printWriter.close();
			sysBuffer.close();
			//bufferedReader.close();
			socket.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
