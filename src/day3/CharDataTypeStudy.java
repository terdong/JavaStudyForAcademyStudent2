package day3;

public class CharDataTypeStudy {
    public static void main(String[] args) {
        // char 타입은 문자 한개를 저장 할 수 있는 데이터 타입이다.
        char c = 'a';
        System.out.println("c = " + c);

        // 숫자도 문자형태로 저장 가능하다.
        c = '1';
        System.out.println("c = " + c);

        // 정수 형태로도 저장이 가능한데, 출력 해보면 문자로 나온다.
        // 사실 char 타입은 숫자로 저장 되고, "char 테이블"이라는 참조 테이블에서 해당 숫자에 매칭되는 문자를 출력한다.
        c = 97;
        System.out.println("c = " + c);

    }
}
