package day10;

import java.util.Scanner;

public class ScannerStudy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isPlay = true;

        System.out.println("계산기 프로그램");

        for(;isPlay;){

            System.out.println("다음 명령어를 입력해주세요(1. 계산하기, 2. 종료)");
            int command = scanner.nextInt();

            if(command == 1) {
                System.out.println("숫자와 연산기호를 각각 한번씩 순서대로 입력해주세요.");

                int firstNumber = scanner.nextInt();
                String operation = scanner.next();
                int secondNumber = scanner.nextInt();

                System.out.print(firstNumber + " " + operation + " " + secondNumber + " = ");

                if (operation.equals("+")) {
                    System.out.println(firstNumber + secondNumber);
                } else if (operation.equals("-")) {
                    System.out.println(firstNumber - secondNumber);
                }
            }else if(command == 2){
                isPlay = false;
                System.out.println("계산기를 종료합니다.");
            }
        }




    }
}
