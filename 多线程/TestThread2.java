public class TestThread2  implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run方法执行");
        }
    }

    public static void main(String[] args) {
        //main线程是主线程


        TestThread2 testThread2 = new TestThread2();

        //创建一个线程对象
        //Thread thread = new Thread(testThread2);

        //调用start()方法开启线程
        new Thread(testThread2).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("主线程执行");
        }
    }

}
