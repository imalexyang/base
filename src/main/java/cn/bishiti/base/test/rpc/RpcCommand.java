package cn.bishiti.base.test.rpc;

import java.io.Serializable;

public class RpcCommand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String className;
	String methodName;
	String[] argumetsType;	
	Object[] params;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String[] getArgumetsType() {
		return argumetsType;
	}
	public void setArgumetsType(String[] argumetsType) {
		this.argumetsType = argumetsType;
	}
	public Object[] getParams() {
		return params;
	}
	public void setParams(Object[] params) {
		this.params = params;
	}
}
