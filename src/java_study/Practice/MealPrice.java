/*돈까스 16인분, 칼국수 8인분, 왕만두 1인분을 시켰을때, 계산서를 출력 예와 같이 작성해 주세요. 가격표는 아래와 같습니다.

        돈까스: 8000원
        칼국수: 6000원
        왕만두: 5000원
        돈가스 x 16 = 128000
        칼국수 x  8 =  80000
        왕만두 x  1 =   5000
        ===================
        총합: 213000
        */
package java_study.Practice;

public class MealPrice {
    public static void main(String[] args) {
        int donprice = 8000;
        int kalprice = 6000;
        int manprice = 5000;

        int donnum = 16;
        int kalnum = 8;
        int mannum = 1;

        System.out.printf("%s X %2d = %6d \n" , "돈까스", donnum, donnum*donprice );
        System.out.printf("%s X %2d = %6d \n" , "칼국수", kalnum, kalnum*kalprice );
        System.out.printf("%s X %2d = %6d \n" , "왕만두", mannum, mannum*manprice );
        System.out.println("====================");
        int sum = donnum*donprice + kalnum*kalprice + mannum + manprice;
        System.out.printf("%s:  %d\n", "총합", sum);
    }
}
