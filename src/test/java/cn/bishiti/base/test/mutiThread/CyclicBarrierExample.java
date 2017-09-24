package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	
	public static void main(String args[]){
		
		Runnable barrier1Action=new Runnable() {			
			@Override
			public void run() {
				System.out.println("barrier1Action 1 executed");				
			}
		};
		
		Runnable barrier2Action=new Runnable(){
			@Override
			public void run() {
				System.out.println("barrier2Action 2 executed");				
			}
		};
		
		CyclicBarrier barrier1=new CyclicBarrier(2, barrier1Action);
		CyclicBarrier barrier2=new CyclicBarrier(2, barrier2Action);
		
		CyclicBarrierRunnable barrierRunnable1=new CyclicBarrierRunnable(barrier1, barrier2);
		CyclicBarrierRunnable barrierRunnabel2=new CyclicBarrierRunnable(barrier1, barrier2);
		
		new Thread(barrierRunnable1).start();
		new Thread(barrierRunnabel2).start();
	}
}
