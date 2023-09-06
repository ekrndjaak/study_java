/*
// 시급, 일한시간 순 입력
8000 160

1280000
 */
package java_study.Practice;

import java.util.Scanner;

public class HourlyWageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pay = input.nextInt();
        int hour = input.nextInt();
        int total = pay * hour;

        System.out.printf("Total pay : %d", total);
        }
    }
