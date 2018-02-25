package day10;

public class Calc {

    int add(int number){
        return number + number;
    }

    public static void main(String [] args){

        Calc calc = new Calc();

        // 2를 넣으면 result에 4가 저장이되게끔 메소드를 만드세요.
        // 즉, x 를 넣으면 x + x 값이 반환되는 메소드를 만드세요.
        int result = calc.add(2);
        System.out.println("result = " + result);

    }
}
