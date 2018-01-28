package day4;

public class StringStudy {
    public static void main(String [] args){

        // String 은 기본 데이터 타입(Primitive Type)이 아닙니다.
        // 일단은 기본 데이터 타입처럼 취급해주세요.
        String str = "Hello World";
        System.out.println("str = " + str);

        str = "안녕하세요?" + " 저는 김동희입니다.";
        System.out.println("str = " + str);

        str = str + "저는 현재 자바 공부를 하고 있어요.";
        System.out.println("str = " + str);
    }
}
