package chapter14.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest2 {
    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;
        for(int i=0; i< bs.length; i++){
            bs[i] = data;
            data++;
        }

        try(FileOutputStream fos = new FileOutputStream("output.txt", true);
            FileInputStream fis = new FileInputStream("output.txt")){
            fos.write(bs);
            int ch;
            while((ch = fis.read()) != -1){
                System.out.println((char) ch);
            }

        }catch (IOException e){

        }
    }
}
