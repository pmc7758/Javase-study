package demo;

import java.io.*;

public class FileStudy {

    public static void main(String[] args) throws FileNotFoundException {
        // I/O流的四大抽象类：InputStream/OutputStream:字节输入/输出流     Reader，Write:字符输入/输出流
        // 文件输入输出流，分为字符和字节流
        // 文件字节输入流：FileInputStream
        InputStream in = null;
        //确定源头
        File file = new File("D:\\javaprojects/test.txt");
        //System.out.println(file.exists());
        try {
            //选择流,记得抛出异常
            in = new FileInputStream(file);
            //操作
            //in.read();
            //System.out.println(in.read());现在控制台输出的是int类型，在强转为char类型
            //System.out.println((char)in.read());//现在读的是一个字符
            byte [] bytes = new byte[1];
            int num = 0;
            while ((num = in.read(bytes)) != -1){
                String str = new String(bytes);
                System.out.println(str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }



}
