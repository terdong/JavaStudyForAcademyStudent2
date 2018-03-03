package day11.constructor;

public class Books {
    public static void main(String[] args) {
        Book book1 = new Book("Java가 보이는 그림책", "ANK");
        book1.print();

        System.out.println();

        Book book2 = new Book(book1);
        book2.print();
    }
}
