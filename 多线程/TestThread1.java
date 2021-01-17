public class TestThread1 extends Thread{

    @Override
    public void run(){
        for (int i = 0;i < 100;i++){
            System.out.println("run方法执行");
        }
    }

    public static void main(String[] args) {
        //main线程是主线程

        //创建一个线程对象
        TestThread1 testThread1 = new TestThread1();

        //调用start()方法开启线程
        testThread1.start();

        for (int i=0;i<200;i++){
            System.out.println("主线程执行");
        }
    }

}