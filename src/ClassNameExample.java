import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String CLASS_NAME = "^[ACP]{1,1}+[0-9]{4}+[GHIKLM]$";

        System.out.println("Nhập tên lớp học : ");
        String className = scanner.nextLine();

        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(className);
        if (matcher.matches()){
            System.out.println(matcher.matches());
            System.out.println("Tên lớp : " + className + " hợp lệ");
        } else {
            System.out.println("Tên lớp : " + className + " không hợp lệ");
        }
    }
}
