public class TestStop extends Thread{

    private boolean flag = true;

    @Override
    public void run(){
            int j = 0;
            while (flag) {
                System.out.println("run方法执行");
                j++;
            }
    }

    public void stopThread(boolean flag){
        this.flag = flag;
    }

    public static void main(String[] args) {
        //创建一个线程对象
        TestStop testStop = new TestStop();

        //调用start()方法开启线程
        testStop.start();

        for (int i=0;i<200;i++){
            System.out.println("主线程执行");
            if(i==199){
                testStop.stopThread(false);
                System.out.println("终止子线程");
            }
        }
    }

}
