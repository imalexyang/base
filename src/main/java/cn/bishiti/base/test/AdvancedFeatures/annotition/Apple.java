package cn.bishiti.base.test.AdvancedFeatures.annotition;

import cn.bishiti.base.test.AdvancedFeatures.annotition.FruitColor.Color;

public class Apple {

	@FruitName("Apple")
	private String appleName;
	
	@FruitColor(fruitColor=Color.Red)
	private String appleColor;
	
	@FruitProvider(id=1,name="红富士",address="北京苹果园")
	private String appleProvider;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}	
	
	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}

	public void displayName(){
		System.out.println("水果的名字是：苹果");
	}
	
}
