package day10;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 숫자 입력해서 저장하기.
        System.out.print("저장할 숫자를 입력해주세요: ");
        int number;
        number = scanner.nextInt();
        System.out.println("입력한 number = " + number);

        // 문자열 입력해서 저장하기.
        System.out.print("저장할 문자열 입력해주세요: ");
        String str = scanner.next();
        System.out.println("입력한 문자열 = " + str);

    }
}
