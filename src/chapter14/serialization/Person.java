package chapter14.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    String job;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
