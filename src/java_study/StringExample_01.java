package java_study;

public class StringExample_01 {
    public static void main(String[] args) {
        String me = "살은 내가 쪄요.";
        System.out.println(me.replaceAll("내가","치킨이"));

        String replaced = me.replace("내가", "치킨이");
        System.out.println(replaced);
    }
}
