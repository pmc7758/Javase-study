package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateStudy {

    public static void main(String[] args) throws Exception {

        //获取当前时间
        java.util.Date date = new java.util.Date();
        System.out.println("现在的时间是" + date);
        System.out.println("现在的时间是" + date.toString());
        //指定打印格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        String now = "2020-10-20 19:43:26";
        //解析时间
        java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(now);
        System.out.println(date1);

        //获取当前时间戳
        long timeStamp = System.currentTimeMillis();
        System.out.println(timeStamp);
        Date date2 = new Date(timeStamp);
        System.out.println(simpleDateFormat.format(date2));

    }
}
