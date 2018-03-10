package day13.books;

public class Novel extends Book {
    private String writer;

    public Novel(String title, String genre, String writer){
        super(title, genre);
        this.writer = writer;
    }

    @Override
    protected void printBook(){

        super.printBook();
        System.out.println("저자: " + writer);

        //System.out.println("제목: " + title);
        //System.out.println("장르: " + genre);
    }


/*    public void printNovel(){
        printBook();
        System.out.println("저자: " + writer);
    }*/
}
