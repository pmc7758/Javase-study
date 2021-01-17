
//多个线程同时操作一个对象（买车票案例）
public class TestThread3 implements Runnable{

    //操作的对象
    private int ticketNumbers = 10;

    @Override
    public void run(){
        while(true){
            if(ticketNumbers<=0){
                break;
            }
            //Thread.currentThread().getName()获取线程名字
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNumbers--+"票");
        }
    }

    public static void main(String[] args) {
        TestThread3 testThread3 = new TestThread3();

        //这里可以理解为run方法为事件，三个人（代理对象）执行就是多事件（事件不一样，因为人都不一样了）的同时执行，就是对多线程的通俗理解
        new Thread(testThread3,"小红").start();
        new Thread(testThread3,"小明").start();
        new Thread(testThread3,"小亮").start();
    }
}
