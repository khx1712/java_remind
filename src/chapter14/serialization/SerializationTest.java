package chapter14.serialization;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args){
        Person person1 = new Person("오승찬", "학생");
        Person person2 = new Person("배원경" , "좆장인");

        try(FileOutputStream fos = new FileOutputStream("serial.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(person1);
            oos.writeObject(person2);


        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("serial.dat");
        ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person t1 = (Person) ois.readObject();
            Person t2 = (Person) ois.readObject();

            System.out.println(t1);
            System.out.println(t2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
