package cn.bishiti.base.test.nio;

import java.nio.IntBuffer;

public class TestIntBuffer {
	public static void main(String[] args) {
		//初始化
	   IntBuffer buffer=IntBuffer.allocate(8);  
	   //赋值
	   for(int i=0;i<buffer.capacity();i++){
		   int j=2*(i+1);    	   
		   buffer.put(j);
	   }     
	   //重设缓冲区
	   buffer.flip();      
	   
	   //获取值
	   while(buffer.hasRemaining()){
		   System.out.print(buffer.get()+" ");
	   }
	   
	   
    }  
}
