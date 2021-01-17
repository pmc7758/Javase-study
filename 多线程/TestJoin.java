public class TestJoin implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println("拥有高级会员的线程"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();
        //主线程
        for(int i = 0;i<100;i++){

            if(i==20){
                //高级会员插队
                thread.join();
            }
            System.out.println("主线程" + i);
        }
    }
}
