package day3;

public class ByteDataTypeStudy {
    public static void main(String [] args){

        // byte 타입은 -128 ~ 127 까지의 정수형 숫자를 저장 할 수 있는 타입이다.
        byte b = 100;
        System.out.println("b = " + b);

        b = -128;
        System.out.println("b = " + b);

        byte b2 = -1;
        b = (byte)(b + b2); // -128 + -1
        System.out.println("b = " + b);
    }
}
