/*
package ch_9;

import java.util.*;

class Student{
    int id;
    String pn;

    public Student(int id, String pn) {
        this.id = id;
        this.pn = pn;
    }
}
public class HashMapStudentsEx {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();

        map.put("황기태",new Student(1, "010-1234-1234"));
        map.put("이재문",new Student(2, "010-1234-11111"));
        map.put("김남윤",new Student(3, "010-1111-1234"));

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("검색할 이름 :");
            String name = scanner.nextLine();
            if(name.equals("exit"))
                break;
            Student student = map.get(name);
            if(student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("id" + student.getId() + "전화: " + student.getpn());
        }
    }
}
*/
