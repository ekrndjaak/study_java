package java_study;

public class Label_eEx {
    public static void main(String[] args) {
        outter:
        for(int i = 0; i<3; i++){
            for(int k = 0; k<3; k++){
                if (i ==0 && k==2)
                    break outter;
                System.out.println(i + "," + k);
            }
        }
    }
}
