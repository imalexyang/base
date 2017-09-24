package cn.bishiti.base.test.providerAndConsumer;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {

    // 定义票
    private int tickets = 100;

    // 定义锁对象
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (tickets > 0) {
            try {
                // 加锁
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "正在出售第" + (tickets--) + "张票");
                }
            } finally {
                // 释放锁
                lock.unlock();
            }
        }
    }

}
