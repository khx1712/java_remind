package chapter1_6.company;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("오승찬");
        student1.setAddress("신중동");
        student1.showStudentInfo();
        student1.setSubject("수학", 100);

        Student student2 = new Student();
        student2.setAddress("노량진");
        student2.setStudentName("김민지");

        System.out.println(student1);
        System.out.println(student2);

        Person person1 = new Person();
        person1.setAge(18);
        person1.setName("오승찬");

        Person person2 = person1.getSelf();
    }
}

