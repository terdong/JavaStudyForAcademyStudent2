package day13.books;

public class Books {
    public static void main(String[] args) {
        Novel novel = new Novel("군림천하","무협","용대운");
        novel.printBook();

        System.out.println();

        Magazine magazine = new Magazine("게이머즈", "게임",15);
        magazine.printBook();
    }
}
