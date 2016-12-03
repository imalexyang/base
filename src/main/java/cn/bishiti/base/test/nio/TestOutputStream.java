package cn.bishiti.base.test.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestOutputStream {

	private static final byte message[]={83, 111, 109, 101, 32,  
        98, 121, 116, 101, 115, 46};
	
	public static void main(String[] args) throws IOException {
		//创建该文件，win10 C盘需要管理员权限创建会失败
		FileOutputStream fos=new FileOutputStream("d://testOutputStream.txt");
		//设置缓冲区大小
		ByteBuffer buffer=ByteBuffer.allocate(message.length);
		//获取通道备用
		FileChannel fc=fos.getChannel();
		//往缓冲区写入数据
		for(int i=0;i<message.length;i++){
			buffer.put(message[i]);
		}
		//重设缓冲区
		buffer.flip();
		//往通道写入数据
		fc.write(buffer);		
		//关闭输出流
		fos.close();
	}

}
