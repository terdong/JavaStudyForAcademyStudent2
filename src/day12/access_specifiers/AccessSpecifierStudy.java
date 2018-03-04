package day12.access_specifiers;

import day12.books.Book;
import day12.books.Magazine;
import day12.books.Novel;

public class AccessSpecifierStudy {
    public static void main(String[] args) {

        Novel novel = new Novel("군림천하","무협","용대운");
        novel.printNovel();

        System.out.println();

        Magazine magazine = new Magazine("게이","게임",11);
        magazine.printMagazine();

        System.out.println();

        magazine.setTitle("병신");
        magazine.setDay(99);
        magazine.printMagazine();

        System.out.println();

        magazine.setTitle("게이머즈");
        magazine.setDay(15);
        magazine.printMagazine();

        System.out.println("발매일: "+ magazine.getDay());
    }
}
