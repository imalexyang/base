package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

import com.alibaba.fastjson.JSONArray;

public class ConcurrentNavigableMapExample {

	public static void main(String[] args) {
		ConcurrentNavigableMap<String,Object> map=new ConcurrentSkipListMap<String,Object>();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		
		ConcurrentNavigableMap<String, Object> headMap=map.headMap("2");
		System.out.println(JSONArray.toJSON(headMap));
		
		ConcurrentNavigableMap<String, Object> tailMap=map.tailMap("2");
		System.out.println(JSONArray.toJSON(tailMap));
		
		ConcurrentNavigableMap<String, Object> subMap=map.subMap("2", "3");
		System.out.println(JSONArray.toJSON(subMap));
	}
}
