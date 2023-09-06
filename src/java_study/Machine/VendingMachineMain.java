package java_study.Machine;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine.printfVersion();
//        클래스명 변수명 = new 클래스명();
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductbutton(100);
        vm1.printfVersion();
        System.out.println(product);
    }
}
