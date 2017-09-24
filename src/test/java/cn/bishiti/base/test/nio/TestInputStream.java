package cn.bishiti.base.test.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestInputStream {
	public static void main(String[] args) throws IOException {
		//获取输入流
		FileInputStream fin=new FileInputStream("c://oem8.log");
		
		//获取通道
		FileChannel fc=fin.getChannel();
		
		//设置缓冲区大小
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		
		//通道读入缓冲区
		fc.read(buffer);
		
		//重设缓冲区
		buffer.flip();
		
		//打印数据
		while(buffer.hasRemaining()){
			System.out.print((char)buffer.get());
		}
		
		//关闭输入流
		fin.close();
	}
}
