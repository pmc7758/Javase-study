import java.io.File;

public class FileList1 {

    public static void main(String[] args) {
            File file = new File("D:\\untitled3");
            File[] files = file.listFiles();
            for(File f: files){
                if (f.isFile()) {
                    System.out.println(f.getPath() + f.getName());
                }else{
                    File[] files1 = f.listFiles();

                    for (File f1:files1) {
                        if(f1.isFile()){
                            System.out.println(f1.getPath() + f1.getName());
                        }
                    }
                }
            }

    }

}
