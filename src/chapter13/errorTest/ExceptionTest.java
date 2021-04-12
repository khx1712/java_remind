package chapter13.errorTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args){
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
                System.out.println("finally");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("escape");

        try(FileInputStream fis2 = new FileInputStream("a.txt")){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("escape");
    }
}
