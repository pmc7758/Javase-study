import java.io.File;

public class FileList {


    public static void main(String[] args) {
        File f2=new File("D:/爬虫学习");
        getFileName(f2);
    }


    public static void getFileName(File file){
        if(file.isFile()){
            //判断是一个文件直接打印文件路径和文件名字
            System.out.println(file.getPath()+file.getName());
        }else{
            File[] f=file.listFiles();
            for (int i = 0; i < f.length; i++) {
                //判断返回的文件数组是不是一个文件
                if(f[i].isFile()){
                    System.out.println(f[i].getPath() +f[i].getName());
                }else{
                    //是一个目录则再次调用本方法遍历这个目录
                    getFileName(f[i]);
                }
            }
        }
    }
}
