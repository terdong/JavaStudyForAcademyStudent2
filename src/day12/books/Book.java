package day12.books;

public class Book {
    private String title;
    private String genre;

    protected Book(String title, String genre){
        this.title= title;
        this.genre = genre;
    }

    protected void printBook(){
        System.out.println("제목: " + title);
        System.out.println("장르: " + genre);
    }

    public void setTitle(String title){
        if(title.equals("게이") || title.equals("병신")){
            System.out.println("저질스럽거나 욕설은 안됩니다.");
            this.title = "책 이름을 바꿔주세요.";
        }else {
            this.title = title;
        }
    }

}
