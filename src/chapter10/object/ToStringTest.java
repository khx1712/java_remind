package chapter10.object;

class Book{
    String title;
    String author;

    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return author +"," +title;
    }
}

class Student implements Cloneable{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student student = (Student) obj;
            return (this.studentId == student.studentId);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ToStringTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("토지", "박결래");

        String str = new String("토지");

        Student student1 = new Student( 10 ,"오승찬");
        Student student2 = new Student( 10 ,"오승찬");

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        Student student3 = (Student) student1.clone();
    }
}
