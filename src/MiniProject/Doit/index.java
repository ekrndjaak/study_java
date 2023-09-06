package MiniProject.Doit;

import java.util.Scanner;

class Task{
    private String title;
    private String description;

    public Task(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
}
public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int choice;
        String Username = "HG";
        String Userpw = "HG";

        while (true){
            System.out.println("이름을 입력해 주세요.");
            String userInput = scanner.nextLine();

            if(userInput.equals(Username)){
                System.out.println("다음 절차를 진행합니다.");
                break;
            } else{
                System.out.println("다시 입력해주세요.");
            }
        }

        while (true){
            System.out.println("비밀번호를 입력해 주세요.");
            String userInput = scanner.nextLine();

            if(userInput.equals(Userpw)){
                System.out.println("환영합니다 HG 님!");
                break;
            } else{
                System.out.println("다시 입력해주세요.");
            }
        }
        do {
            System.out.println("할일 관리 애플리케이션");
            System.out.println("1. 할일 추가");
            System.out.println("2. 할일 수정");
            System.out.println("3. 할일 삭제");
            System.out.println("4. 할일 조회");
            System.out.println("5. 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    editTask(scanner);
                    break;
                case 3:
                    deleteTask(scanner);
                    break;
                case 4:
                    showTasks(scanner);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
    private static void addTask(Scanner scanner) {
        System.out.println("제목 :");
        String title = scanner.next();
        System.out.println("내용 :");
        String description = scanner.next();

    }
    private  static void editTask(Scanner scanner){
        System.out.println("변경하고싶은거 : ");
        String title = scanner.nextLine();
        System.out.println("변경할 내용 :");
        String description = scanner.nextLine();
    }
    private static void deleteTask(Scanner scanner){
        System.out.println("지우고싶은 것 : ");
        String title = scanner.nextLine();
    }
    private static void showTasks(Scanner scanner){
        System.out.println("idk");
    }
}
