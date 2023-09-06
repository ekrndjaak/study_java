/* 화폐개수 세기
10만원 짜리 수표가 들어가는 자판기를 만들려고한다. 자판기에 수표를 입력하면 거스름돈을 계산하여
정확하게 필요한 화폐들의 개수를 계산하여야 한다. 이를 계산하는 프로그램을 작성하시오
 */
package java_study.Practice;
import java.util.Scanner;
public class CountMoney {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("거스름돈을 입력하세요 ");
        int charge = Integer.parseInt(sc.nextLine());

        System.out.println("5만원권" + (charge / 50000) + "개");
    }
}
