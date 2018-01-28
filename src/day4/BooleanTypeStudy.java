package day4;

public class BooleanTypeStudy {
    public static void main(String [] args){
        // 조건식: 조건 연산자를 이용해서 임의의 두 매개체를 비교하는 식.
        // boolean 타입은 true, false 값만 가지는 데이터 타입이다.
        boolean b = true;
        System.out.println("true b = " + b);
        b = false;
        System.out.println("false b = " + b);

        // 동일한 변수명으로 중복 선언 할 수 없다.
        // boolean b = 1 < 2;  <-- 에러 나는 코드

        // 조건식의 결과는 true, false 중에 하나를 반환해서 b 변수에 대입된다.
        b = 1 < 2;
        System.out.println("1 < 2 = " + b);

        // false 값이 저장된다.
        b = 3 * 9 > 4 * 7;
        System.out.println("3 * 9 > 4 * 7 = " + b);

        // 두 개의 매개체(99와 99)가 같으면 true, 틀리면 false를 반환한다.
        b = 99 == 99;
        System.out.println("99 == 99 = " + b);

        // -1이 0보다 작거나 같은 경우는 true, 아니면 false를 반환한다.
        b = -1 <= 0;
        System.out.println("-1 <= 0 = " + b);

        // 1과 0이 같지 않으면 true, 같으면 false를 반환한다.
        b = 1 != 0;
        System.out.println("1 != 0 = " + b);

        // 논리연산자: 두개의 조건식을 조합 하는 연산자

        // 논리곱연산자 or AND 연산자: 두 개의 식이 둘 다 true 일 경우 true를 반환. 그 이외에는 false를 반환.
        b = -1 <= 0 && 1 != 0;
        System.out.println("-1 <= 0 && 1 != 0  =  " + b);

        // 논리합연산자 or OR 연산자: 양 쪽의 식 중 어느 한개의 식이라도 true면 true를 반환, 모든 식의 결과가 false false를 반환.
        b = -1 <= 0 || 1 != 0;
        System.out.println("-1 <= 0 || 1 != 0  =  " + b);

        // 부정연산자 or NOT 연산자: 하나의 식의 결과를 반대로 반환.
        b = !(-1 <= 0);
        System.out.println("!(-1 <= 0) = " + b);

        boolean b1 = 100 < 99;
        boolean b2 = -1 < 0;

        b = b1 && b2;
        System.out.println("b1 && b2 = " + b);

    }
}
