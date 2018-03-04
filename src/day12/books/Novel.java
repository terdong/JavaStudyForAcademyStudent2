package day12.books;

public class Novel extends Book{
    private String writer;

    public Novel(String title, String genre, String writer){
        super(title, genre);
        this.writer = writer;
    }

    public void printNovel(){
        printBook();
        System.out.println("저자: " + writer);
    }
}
