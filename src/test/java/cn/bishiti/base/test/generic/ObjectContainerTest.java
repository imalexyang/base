package cn.bishiti.base.test.generic;

import java.util.ArrayList;
import java.util.List;

public class ObjectContainerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectContainer myObj = new ObjectContainer();
		myObj.setObj("abc");
		System.out.println(myObj.getObj());
		
		myObj.setObj("xyz");
		System.out.println(myObj.getObj());
		
		List objectList = new ArrayList();
		objectList.add(myObj);
		String str = (String) ((ObjectContainer)objectList.get(0)).getObj();
		System.out.println(str);
	}

}
