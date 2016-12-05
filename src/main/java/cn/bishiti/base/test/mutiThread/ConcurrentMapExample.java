package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExample {
	
	public static void main(String args[]){
		ConcurrentMap<String,Object> map=new ConcurrentHashMap<String,Object>();
		
		map.put("key", "hello world");
		
		System.out.println(map.get("key"));
	}
	
}
