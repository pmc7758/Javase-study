import java.util.concurrent.*;

//多个线程同时操作一个对象（买车票案例）
public class TestThread4 implements Callable<Boolean> {

    //操作的对象
    private int ticketNumbers = 10;

    @Override
    public Boolean call() {
        while(true){
            if(ticketNumbers<=0){
                break;
            }
            //Thread.currentThread().getName()获取线程名字
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNumbers--+"票");
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThread4 t1 = new TestThread4();
        TestThread4 t2 = new TestThread4();
        TestThread4 t3 = new TestThread4();
        //创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> r1 = executorService.submit(t1);
        Future<Boolean> r2 = executorService.submit(t2);
        Future<Boolean> r3 = executorService.submit(t3);
        //获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();
        //关闭服务
        executorService.shutdown();
    }
}
