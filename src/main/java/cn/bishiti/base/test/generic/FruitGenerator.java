package cn.bishiti.base.test.generic;

import java.util.Random;

public class FruitGenerator implements Generator<String>{

	private String[] fruits = new String[]{"apple","banana","orange"};
	
	@Override
	public String next() {
		Random rand = new Random();		
		return fruits[rand.nextInt(3)];
	}

}
