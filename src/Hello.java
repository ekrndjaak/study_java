import java.util.Scanner;

public class Hello {
    public static boolean inRect(int x, int y, int rectx1, int rectx2,
                                 int recty1, int recty2)
    {
        if(( x>= rectx1 && x <= rectx2) && (y>=recty1 && y<=recty2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("두 점의 좌표를 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if(inRect(x1,y1,100,100,200,200)||
                inRect(x2,y2,100,100,200,200)||
                inRect(x1,y2,100,100,200,200)||
                inRect(x2,y1,100,100,200,200))
                System.out.println("충돌합니다.");

        else if(inRect(x1,y1,100,100,200,200)&&
                inRect(x2,y2,100,100,200,200)&&
                inRect(x1,y2,100,100,200,200)&&
                inRect(x2,y1,100,100,200,200))
                System.out.println("충돌합니다.");

        else if(inRect(100,100,x1,y1,x2,y2) &&
                inRect(100,200,x1,y1,x2,y2)&&
                inRect(200,100,x1,y1,x2,y2)&&
                inRect(200,200,x1,y1,x2,y2))
                System.out.println("충돌합니다.");
        else
                System.out.println("충돌하지 않습니다.");
        scanner.close();
    }
}