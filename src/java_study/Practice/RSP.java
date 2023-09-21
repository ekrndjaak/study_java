package java_study.Practice;

import java.util.Scanner;

public class RSP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        String UserChoice, ComChoice;
        int CC; // 컴퓨터가 낸거
        System.out.println("가위, 바위, 보 시작한다.");
        do {
            System.out.println("가위, 바위, 보!! >>");
            UserChoice = scanner.next();
            if (UserChoice.equals("그만")) break;
            CC = (int) (Math.random() * 3);
            ComChoice = str[CC];
            if (UserChoice.equals("가위")) {
                if (str[CC].equals("가위")) {
                    System.out.println("사용자 :" + UserChoice + ",컴퓨터 = " + ComChoice + "비겼다!");
                    continue;
                } else if (str[CC].equals("바위")) {
                    System.out.println("사용자 :" + UserChoice + ",컴퓨터 = " + ComChoice + "졌다!");
                    continue;
                } else if (str[CC].equals("보")) {
                    System.out.println("사용자 :" + UserChoice + ",컴퓨터 = " + ComChoice + "이겼다!");
                    continue;
                }
            }
            if (UserChoice.equals("바위")) {
                if (str[CC].equals("가위")) {
                    System.out.println("사용자 :" + UserChoice + ",컴퓨터 = " + ComChoice + "이겼다!");
                    continue;
                }
                else if(str[CC].equals("바위")){
                    System.out.println("사용자 :" + UserChoice + ",컴퓨터 = " + ComChoice + "비겼다!");
                    continue;
                } else if (str[CC].equals("보")) {
                    System.out.println("사용자 :" + UserChoice + ",컴퓨터 = " + ComChoice + "졌다!");
                    continue;
                }
            }
            if(UserChoice.equals("보")){
                if(str[CC].equals("가위")){
                    System.out.println("사용자 :" + UserChoice + ",컴퓨터 = " + ComChoice + "졌다!");
                    continue;
                } else if (str[CC].equals("바위")) {
                    System.out.println("사용자 :" + UserChoice + ",컴퓨터 = " + ComChoice + "이겼다!");
                    continue;
                } else if (str[CC].equals("보")) {
                    System.out.println("사용자 :" + UserChoice + ",컴퓨터 = " + ComChoice + "비겼다!");
                    continue;
                }
            }
            System.out.println("사용자=" + UserChoice + ", 컴퓨터 = "+ ComChoice + "");
            }while(true);
        System.out.println("게임을 종료합니다.");
        scanner.close();
        }
    }
