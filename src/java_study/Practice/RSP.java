package java_study.Practice;

import java.util.Scanner;

public class RSP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str[] = {"가위", "바위", "보"};
        String UserSelect, ComSelect;
        int a; // Computer input
        System.out.println("가위 바위 보! >> ");
        do {
            UserSelect = scanner.next();
            if (UserSelect.equals("그만")) break;
            a = (int) (Math.random() * 3);
            ComSelect = str[a];
            if(UserSelect.equals("가위")){
                if(str[a].equals("가위")){
                    System.out.println("사용자 = " + UserSelect ", 컴퓨터 =" + ComSelect + "비겼습니다.");
                    continue;
                }
            }   else if(str[a].equals("바위")){
                System.out.println("사용자 = " + UserSelect + ", 컴퓨터 =" + ComSelect + "사용자가 졌습니다.");
                continue;
            }
        }
        }
}
