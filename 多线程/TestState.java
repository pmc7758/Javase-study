import java.text.SimpleDateFormat;
import java.util.Date;

public class TestState {

        public static void main(String[] args) {
            while(true){
                try {
                    Thread thread = new Thread();
                    thread.start();
                    thread.sleep(1000);
                    System.out.println(thread.getState());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
