package cn.bishiti.base.test.nio;

import java.nio.ByteBuffer;

public class TestSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer buffer=ByteBuffer.allocate(10);
		
		for(int i=0;i<buffer.capacity();i++){
			buffer.put((byte)i);
		}
		
		buffer.position(3);
		buffer.limit(7);
		
		ByteBuffer slice=buffer.slice();
		
		for(int i=0;i<slice.capacity();i++){
			byte b=slice.get(i);
			b*=10;			
			slice.put(i,b);
		}
		
		buffer.position(0);
		buffer.limit(buffer.capacity());
		
		while(buffer.hasRemaining()){
			System.out.println(buffer.get());
		}
	}

}
