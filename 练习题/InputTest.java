import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] b = new String[100];
        for (int a =0; a<100 ; a++){
            b[a] = scanner.nextLine();
            if(b[a].equals("end")){
                scanner.close();
                for(String str:b){
                    if (str!=null&&!str.equals("end")) {
                        System.out.println(str);
                    }
                }
                break;
            }
        }
    }
}
