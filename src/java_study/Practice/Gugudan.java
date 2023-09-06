package java_study.Practice;

public class Gugudan {
    public static void main(String[] args) {
        String str1 = "Hello" + 1;
        String str2 = "Hello" + true;
        String str3 = "Hello" + 50.4;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        for(int i = 1; i<=9; i++){
            System.out.println( "1*" + i + "=" + (1 *i));
        }

        for(int k = 2; k <=9; k++){
            for(int n = 1; n<=9; n++){
                System.out.println(k + "*" + n + "=" + (k*n));
            }
        }
    }
}
