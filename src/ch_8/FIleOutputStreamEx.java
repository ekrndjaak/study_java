package ch_8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class FIleOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7,51,3,4,-1,24};
        try{
            FileOutputStream fout = new  FileOutputStream("c;\\Temp\\test.out");
            for(int i=0; i<b.length; i++)
                fout.write(b[i]);
            fout.close();
        } catch(IOException e){
            System.out.println("c:\\Temp\\test.out에 저장할 수 없습니다.");
            return;
        }
        System.out.println("저장완료");
    }
}
