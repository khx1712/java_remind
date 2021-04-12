package chapter14.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("input.txt")) {

            int i;
            byte[] bs = new byte[10];
            while((i = fis.read(bs)) != -1){
                for(int j = 0; j<i; j++) {
                    System.out.print((char) bs[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("끝");
    }
}
