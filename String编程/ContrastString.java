import java.util.Scanner;

public class ContrastString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("----------");
        String b = scanner.nextLine();
        if(a.equals(b)){
            System.out.println("相同");
        }else {
            System.out.println("不相同");
        }
    }
}
