package cn.bishiti.base.test.rpc.demo1;

import java.io.IOException;

public interface Server {

	public void stop();
	
	public void start() throws IOException;
	
	public void register(Class serviceInterface,Class impl);

	public boolean isRunning();
	
	public int getPort();
}
