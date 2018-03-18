package day15.algorithm;

import java.util.Scanner;

public class Quiz_2_FactorialProblem {

    static long operateFactorial(long number, long result){
        if(number == 1){
            return result;
        }else{
            return operateFactorial(number -1, result * number);
        }
    }

    /*
    문제: 사용자가 입력한 수의 팩토리얼 값을 구하세요.
    팩토리얼: 1 ~ n 까지의 곱셉의 결과.(ex: n = 3 인 경우, 1 x 2 x 3 = 6)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("팩토리얼 구하는 프로그램");

        for(;;) {
            System.out.println("메뉴: 1. 팩토리얼 실행, 2. 종료");
            int command = scanner.nextInt();
            if(command == 1){
                System.out.print("계산할 숫자를 입력: ");
                int number = scanner.nextInt();
                long result = operateFactorial(number, 1);
                System.out.println("숫자 " + number + "에 대한 계산 결과는 " + result + " 입니다.");
            }else if(command == 2){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 명령어 입니다.");
            }
            System.out.println();
        }


    }
}
