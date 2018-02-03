package day5;

public class Position {
    public static void main(String[] args) {

        int a= 1, b= 1;
        int result;

        result = --a; // a = a - 1 의 결과를 result에 저장
        System.out.println("a = " + a);
        System.out.println("--a 값을 저장한 result = " + result);

        result = b--; // b의 값을 result에 저장하고 b = b - 1을 연산.
        System.out.println("b = " + b);
        System.out.println("b-- 값을 저장한 result = " + result);

        a = 1;
        b = 1;
        System.out.println("전치일 경우 " + ++a + "가 됩니다");
        System.out.println("후치일 경우 " + b++ + "가 됩니다");
    }
}
