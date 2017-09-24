package cn.bishiti.base.test.nio;

import java.nio.ByteBuffer;

public class BufferWrap {
	@SuppressWarnings("unused")
	public void myMethod(){
		ByteBuffer buffer1=ByteBuffer.allocate(10);		
		byte array[]=new byte[10];		
		ByteBuffer buffer2=ByteBuffer.wrap(array);
	}
}
