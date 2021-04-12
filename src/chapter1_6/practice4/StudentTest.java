package chapter1_6.practice4;

public class StudentTest {
    public static void main(String[] args){
        Student Lee = new Student("Lee");
        Student Kim = new Student("Kim");
        Student Cho = new Student("Cho");

        for(int i=1; i<= 2; i++) {
            Lee.addBook("태백산맥" + i);
        }
        for(int i=1; i<= 3; i++) {
            Kim.addBook("토지" + i);
        }
        for(int i=1; i<= 6; i++) {
            Cho.addBook("해리포터"+ i);
        }

        Lee.printStudentInfo();
        Kim.printStudentInfo();
        Cho.printStudentInfo();
    }

}
