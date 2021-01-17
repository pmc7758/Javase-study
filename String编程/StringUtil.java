import java.util.Scanner;

public class StringUtil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a = a.replaceAll(" ","");
        System.out.println(a);
    }
}
