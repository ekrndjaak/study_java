package java_study;

public class Operator {
    public static void main(String[] args) {
        System.out.println( 2+ 3 );
        System.out.println(5-2);
        System.out.println(2 * 3);
        System.out.println(6 / 2);
        System.out.println(6 % 3);

        System.out.println((2 - 4) / 2);

        int number = 5;
        number = 6; //정수형만 대입 가능
        System.out.println(number);

        System.out.println(1 + 1.2); //정수 + 실수 = 실수
        System.out.println(9 / 3); // 정수 / 정수 = 정수
        System.out.println(7 / 3.5); // 정수 / 실수 = 실수

        System.out.println(2 < 3);
        System.out.println((2 <= 3));
        System.out.println(2 > 3);
    }
}
