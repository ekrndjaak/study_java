// meter를 입력받아 km 와 m 로 출력하는 프로그램을 작성하시오.
package java_study.Practice;
import java.util.Scanner;

public class KmChange {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("거리를 입력하세요 :");
        int i = Integer.parseInt(sc.nextLine());
        int k;
        if (i < 1000) {
            System.out.println(i + "m");
        } else {
            k = i / 1000;
            System.out.println(k + "km");
        }
    }
}
