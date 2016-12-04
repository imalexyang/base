package cn.bishiti.base.test.nio;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

public class TestSelector {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Selector selector=Selector.open();		
		ServerSocketChannel channle = ServerSocketChannel.open();
		channle.configureBlocking(false);		
		channle.register(selector, SelectionKey.OP_READ);
		
		while(true){
			int readyChannles=selector.select();
			if(readyChannles==0){
				continue;
			}
			Set<SelectionKey> selectKeys=selector.keys();
			Iterator<SelectionKey> keyIterator=selectKeys.iterator();
			
			while(keyIterator.hasNext()){
				SelectionKey key=keyIterator.next();
				if(key.isAcceptable()){
					
				}else if(key.isConnectable()){
					
				}else if(key.isReadable()){
					
				}else if(key.isWritable()){
					
				}
				keyIterator.remove();
			}
		}
		
		
	}

	
	
}
