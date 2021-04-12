package chapter1_6.company;

public class Person {
    private String name;
    private int age;

    public Person(){
        this("이름없음", 16);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Person getSelf(){
        return this;
    }
}
