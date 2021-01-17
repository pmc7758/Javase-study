import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {

    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();
        new Thread(saleTicket,"小明").start();
        new Thread(saleTicket,"小胖").start();
    }
}

class SaleTicket implements Runnable {
    private int ticket = 10;

    private final ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        try {
            while (true) {
                reentrantLock.lock();//加锁
                if (ticket > 0) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "买了第" + ticket-- + "票");
                } else {
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();//解锁
        }
    }
}