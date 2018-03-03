package day11.constructor;

public class Book {
    String title;
    String writer;
    Book(String title, String writer){
        this.title = title;
        this.writer = writer;
    }

    Book(Book copy){
        title = copy.title;
        writer = copy.writer;
    }
    void print(){
        System.out.println("제목: " + title);
        System.out.println("저자: " + writer);
    }
}
