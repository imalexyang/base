package cn.bishiti.base.test.rpc.demo1;

import java.io.IOException;
import java.net.InetSocketAddress;

public class RPCTest {

	public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Server serviceServer = new ServiceCenter(8088);
                    serviceServer.register(HelloService.class, HelloServiceImpl.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("test"));
        
        //http://www.cnblogs.com/codingexperience/p/5930752.html
    }

}
