package Practice;

public class BaeSu {
    public static void main(String[]args) {
        int total = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                total = total + i;

            }
        }
        System.out.printf("3의 배수의 합 : %d", total);
    }
}
