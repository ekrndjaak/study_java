/*
1 유로 = 1320.48026 원
1 달러 = 1063.82979 원

// 유로, 달러 순 입력
58 32

58유로 + 32달러 = 109268 원
 */
package java_study.Practice;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Euro = input.nextInt();
        int Dalla = input.nextInt();

        double EuroRate = 1320.48026;
        double DallaRate = 1063.82979;

        int won = (int)(Euro * EuroRate + Dalla * DallaRate);
        System.out.printf("%d 유로 + %d 달러 = %d won", Euro, Dalla, won);
    }
}
