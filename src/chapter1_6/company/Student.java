package chapter1_6.company;

public class Student {
    private int studentId;
    private String studentName;
    private String address;

    private Subject korea;
    private Subject math;

    public Student(){
        korea = new Subject();
        math = new Subject();
    }

    public Student(int id, String name){
        studentId = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
    }

    public void setSubject(String name, int score){
        korea.setSubjectName(name);
        korea.setScore(score);
    }

    public void showStudentInfo(){
        System.out.println(studentName +","+address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName(){
        return this.studentName;
    }
}
