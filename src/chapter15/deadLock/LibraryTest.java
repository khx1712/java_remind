package chapter15.deadLock;

import java.util.ArrayList;

class FastLibrary{
    public ArrayList<String> books = new ArrayList<>();

    public FastLibrary() {
        this.books.add("태백산맥1");
        this.books.add("태백산맥2");
        this.books.add("태백산맥3");
    }

    public synchronized String landBook() throws InterruptedException {
        Thread t= Thread.currentThread();
        while (books.isEmpty()){
            System.out.println(t.getName() + " waiting start!");
            wait();
            System.out.println(t.getName() + " waiting end!");
        }
        String title = books.remove(0);
        System.out.println(t.getName() + " : " + title + " lend!");
        return title;
    }

    public synchronized void returnBook(String book){
        Thread t= Thread.currentThread();
        books.add(book);
        notifyAll();
        System.out.println(t.getName() + " : " + book + " return!");
    }
}

class Student extends Thread{
    public void run(){
        try {
            String title = LibraryTest.library.landBook();
            if(title == null) return;
            sleep(5000);
            LibraryTest.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryTest {
    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        student1.start();
        student2.start();
        student3.start();
        student4.start();
        student5.start();
        student6.start();
    }
}
