package Practice;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float side1 = scanner.nextFloat();
        float side2 = scanner.nextFloat();

        float hypotenuse =(float) Math.sqrt(Math.pow(side1,2) + Math.pow(side2, 2));

        System.out.printf("빗변의 길이 : %.2f ", hypotenuse);






    }
}
