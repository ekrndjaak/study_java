package java_study;

public class StringExample_02 {
    public static void main(String[] args) {
        String birthday = "2000/04/30";
        String year = birthday.substring(0, 4);
        String day = birthday.substring(5, 6);
        String month = birthday.substring(8, 9);
        System.out.println(year);
        System.out.println(day);
        System.out.println(month);

    }
}
