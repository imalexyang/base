package cn.bishiti.base.test.AdvancedFeatures.annotition;

import cn.bishiti.base.test.AdvancedFeatures.annotition.FruitColor.Color;

public class Apple {

	@FruitName("Apple")
	private String appleName;
	
	@FruitColor(fruitColor=Color.Red)
	private String appleColor;

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
	
	public void displayName(){
		System.out.println("水果的名字是：苹果");
	}
	
}
