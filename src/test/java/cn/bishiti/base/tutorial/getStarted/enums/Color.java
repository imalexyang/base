package cn.bishiti.base.tutorial.getStarted.enums;

public enum Color {
	RED("红色",0),GREEN("绿色",1),BLACK("黑色",2),YELLOW("黄色",3);
	
	private String color;
	private int index;
	
	private Color(String color,int index){
		this.color = color;
		this.index = index;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
