package java_study.Machine;

public class VendingMachine {
    public String pushProductbutton(int menuId){
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }

    public static void printfVersion(){
        System.out.println("v1.0");
    }
}
