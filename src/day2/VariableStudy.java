package day2;

public class VariableStudy {
    public static void main(String [] args){

        // number 라는 이름의 int 타입 변수를 선언.
        // 1+1 = 2
        int number;
        number = 99 * 3;
        // 변수를 println을 통해 출력 할 수 있다.
        System.out.println(number);

        // int 타입의 number1 변수를 "선언한다" 라고 한다.
        int number1;
        // number1 변수에 9 값을 "정의한다" 혹은 "대입한다" 라고 한다.
        number1 = 9;

        // 선언과 정의를 동시에 할 수 있다.
        int number2 = -3;

        // 두 개의 변수로 곱하기 연산을 하여 result 변수에 값을 대입한다.
        int result = number1 * number2;

        System.out.print("9 * -3 = ");
        System.out.println(result);

        // 문자열과 숫자 혹은 int 타입의 변수를 + 연산기호를 통해 합칠 수 있다.
        System.out.println("9 * -3 = " + result);

        // 괄호를 이용해서 숫자 먼저 계산할 수 있다.
        System.out.println("9 * -3 = " + (9 + -3));
    }
}
