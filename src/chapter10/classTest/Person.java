package chapter10.classTest;

public class Person {

    private String name;
    private int age;

    public Person(){}
    public Person(String name){};
    public Person(String name, int age){};

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
