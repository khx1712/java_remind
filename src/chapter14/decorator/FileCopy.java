package chapter14.decorator;

import java.io.*;
import java.net.Socket;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        long milliSeconds = 0;
        try(FileOutputStream fos = new FileOutputStream("copy.zip");
            FileInputStream fis = new FileInputStream("a.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){

            milliSeconds = System.currentTimeMillis();
            int i;
            while ((i = bis.read()) != -1){
                bos.write(i);
            }
            milliSeconds = System.currentTimeMillis() - milliSeconds;
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        Socket socket = new Socket();

        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        isr.readLine();

        System.out.println("시간 :" + milliSeconds);
    }
}
