package chapter14.stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class streamTest {
    public static void main(String[] args) {
        System.out.println("입력: ");
        try {
            int i;
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            while((i = inputStreamReader.read()) != '\n'){
                System.out.println(i);
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
