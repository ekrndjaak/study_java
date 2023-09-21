package MiniProject.Doit;

import java.util.ArrayList;
import java.util.Scanner;
public class Index {

    public static class TodoList {
        private ArrayList<String> tasks;

        public TodoList() {
            tasks = new ArrayList<>();
        }

        public void addTask(String task) {
            tasks.add(task);
            System.out.println("할일이 추가되었습니다." + task);
        }

        public void listTasks() {
            System.out.println("할일 목록 :");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + "." + tasks.get(i));
            }
        }

        public void completeTask(int index) {
            if (index >= 1 && index <= tasks.size()) {
                String completeTask = tasks.remove(index - 1);
                System.out.println("할일이 완료되었습니다." + completeTask);
            } else {
                System.out.println("올바른 인덱스를 선택하세요.");
            }
        }

        public void deleteTask(int index) {
            if (index >= 1 && index <= tasks.size()) {
                String deletedTask = tasks.remove(index - 1);
                System.out.println("할일이 삭제되었습니다." + deletedTask);
            } else {
                System.out.println("올바른 인덱스를 선택하세요.");
            }
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner((System.in));

        while(true){
            System.out.println("\n할일 관리 프로그램");
            System.out.println("1. 할일추가");
            System.out.println("2. 할일 목록 보기");
            System.out.println("3. 할일 완료 표시");
            System.out.println("4. 할일 삭제");
            System.out.println("5. 종료");
            System.out.println("원하는 작업을 선택하세요 : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.println("추가할 할일을 입력하세요 : ");
                    String newTask = scanner.nextLine();
                    todoList.addTask((newTask));
                    break;
                case 2:
                    todoList.listTasks();
                    break;
                case 3:
                    System.out.println("완료한 할일의 번호를 입력해주세요");
                    int completeIndex = scanner.nextInt();
                    todoList.completeTask((completeIndex));
                    break;
                case 4:
                    System.out.println("삭제할 할일의 번호를 입력하세요 :");
                    int deleteIndex = scanner.nextInt();
                    todoList.deleteTask(deleteIndex);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("올바른 작업 번호를 선택하세요.");
            }
        }
    }
}
