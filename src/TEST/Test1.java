package TEST;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Connect User Name : ");

        int UserName = Integer.parseInt(sc.nextLine());

        System.out.printf(" %s 님! 아이디를 입력해주세요", UserName);

    }
}
