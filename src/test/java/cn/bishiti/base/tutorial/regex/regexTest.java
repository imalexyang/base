package cn.bishiti.base.tutorial.regex;

import java.util.regex.Pattern;

public class regexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		
		System.out.println(Pattern.matches(regex, "13456789011"));
		
		String regexMobile = "^((13[0-9])|(15[89]))-\\d{4}-\\d{4}$";
		
		System.out.println(Pattern.matches(regexMobile, "158-9789-0111"));
		
		
		String regexEmail = "^[a-zA-Z0-9]{3,12}@[a-zA-Z0-9]{3,5}.[a-zA-Z]{2,5}$";
		
		System.out.println(Pattern.matches(regexEmail, "123@163.com"));
		
	}

}
