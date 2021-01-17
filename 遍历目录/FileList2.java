import java.io.File;

public class FileList2 {

    public static void main(String[] args) {
        File file = new File("D:/untitled3");
        File[] files = file.listFiles();
        for (File f : files) {
            while (f.isFile()) {
                System.out.println(f.getParent() + f.getName());
            }
            File[] files1 = f.listFiles();
            for(File f1:files1){
                while (f.isFile()) {
                    System.out.println(f.getParent() + f.getName());
                }
            }
        }

    }



}