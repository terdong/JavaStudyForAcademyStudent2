package day3;

public class FloatDataTypeStudy {
    public static void main(String [] args){
        // 두가지 방법으로 float 변수에 값을 대입 가능.
        float f = 3.14f;
        f = (float)3.14;
        System.out.println("f = " + f);

        int r = 4;
        int halfRound = r / 2;

        float result = f * halfRound * halfRound;
        System.out.println("지름이 4cm인 원의 넓이 = " + result + "cm/2");
    }
}
