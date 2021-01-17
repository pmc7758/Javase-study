import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep {
    public static void main(String[] args) {
        Date startTime = new Date(System.currentTimeMillis());//获取当前时间
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis());//刷新时间
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
