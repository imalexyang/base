package cn.bishiti.base.test.AdvancedFeatures.clone;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.fusesource.hawtbuf.ByteArrayInputStream;

public class Sheep implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6486032491822369547L;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@SuppressWarnings("resource")
	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bo=new ByteArrayOutputStream();
		ObjectOutputStream oo=new ObjectOutputStream(bo);
		oo.writeObject(this);
		
		InputStream bi=new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi=new ObjectInputStream(bi);
		return (oi.readObject());
	}
}
