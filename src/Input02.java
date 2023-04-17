import java.util.Scanner;

public class Input02{
    public static void main(String[] args) {
        System.out.println("숫자를 하나입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        System.out.println(intInput + 1);
    }
}
