package day4;

public class IfStatementStudy4 {
    public static void main(String[] args) {

        int number = 228;
        System.out.print(number + "은 ");

        if (0 <= number && number <= 9) {
            System.out.println("1자리 수입니다");
        } else if (10 <= number && number <= 99) {
            System.out.println("2자리 수입니다");
        } else if (100 <= number && number <= 999) {
            System.out.println("3자리 수입니다.");
        } else {
            System.out.println("4자리 수입니다.");
        }
    }
}
