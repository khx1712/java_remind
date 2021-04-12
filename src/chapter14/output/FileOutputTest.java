package chapter14.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            fos.write(65);
            fos.write(65);
            fos.write(65);
        }catch (IOException e){

        }
    }
}
