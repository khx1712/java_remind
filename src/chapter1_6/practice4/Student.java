package chapter1_6.practice4;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Book> bookArrayList;

    public Student(String name){
        this.name = name;
        bookArrayList = new ArrayList<Book>();
    }

    public void addBook(String bookName){
        Book book = new Book(bookName);
        bookArrayList.add(book);
    }

    public void printStudentInfo(){
        System.out.print(this.name + " 학생이 읽은 책은 : ");
        for(Book book : bookArrayList){
            System.out.print(book.getName() + " ");
        }
        System.out.println("입니다");
    }
}
