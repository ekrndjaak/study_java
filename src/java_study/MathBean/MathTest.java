package java_study.MathBean;

public class MathTest {
    public static void main(String[] args) {
        //클래스명 변수명 = new 클래스명
        math main = new math(); // heap이라는 메모리에 올라감
        main.printclassname();
        main.printnumber(5000);

        int x = main.getOne();
        System.out.println(x);

        int value = main.plus(200,300);
        System.out.println(value);
    }
}
