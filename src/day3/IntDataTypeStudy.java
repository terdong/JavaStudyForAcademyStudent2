package day3;

public class IntDataTypeStudy {
    public static void main(String [] args){

        // 여러분 안녕하세요?

        // int 타입은 음수, 0, 양수. 즉, 정수만을 저장 할 수 있다.
        // 저장 할수 있는 숫자의 범위는 -2147483648 ~ 2147483647 까지 저장 가능하다.
        int i = 100;
        // i 값 출력
        System.out.println("i = " + i);

        // i에 최대 양수 값 대입 후 출력
        i = 2147483647;
        System.out.println("i = " + i);

        // i에 최대 양수 값을 초과한 값 대입 후 출력
        i = 2147483647 + 1;
        System.out.println("i = " + i);

    }
}
