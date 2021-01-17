import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.next();
        //Pattern类 正则表达式的编译表示。
        Pattern pattern = Pattern.compile("^\\d{11}$");
        //Matcher 通过解释Pattern对字符序列执行匹配操作的引擎
        Matcher matcher = pattern.matcher(phoneNumber.toString());
        System.out.println(phoneNumber + "匹配结果：" + matcher.matches());
    }
}

