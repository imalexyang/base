package cn.bishiti.base.test.AdvancedFeatures.enumUtil;

public enum Grade {
	A(1,20),
	B(3,40),
	C(5,60),
	D(7,80),
	E(9,100);
	
	private final int ls;
	private final int hs;
	
	private Grade(int ls,int hs){
		this.ls=ls;
		this.hs=hs;
	}
	
	public int getLow(){
		return ls;
	}
	
	public int getHigh(){
		return hs;
	}
	
	public static Grade getGrade(int s){
		for(Grade g:Grade.values()){
			if(s>g.ls&&s<g.hs){
				return g;
			}
		}
		return null;
	}
}
