package cn.bishiti.base.test.providerAndConsumer;

public class SellTicketTest {
	
	public static void main(String args[]){
		SellTicket tick=new SellTicket();
		
		new Thread(tick,"窗口1：").start();
		new Thread(tick,"窗口2：").start();
		new Thread(tick,"窗口3：").start();
	}
	
}
