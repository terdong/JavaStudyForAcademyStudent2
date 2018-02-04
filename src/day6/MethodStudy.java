package day6;

public class MethodStudy {

    // 매개변수, 반환값이 있는 메소드
    static int add(int number){
        int result = number + 4;
        return result;
    }

    // 매개변수만 있는 메소드
    static void printAdd(int number){
        int result = number + 4;
        System.out.println("result = " + result);
    }

    // 반환값만 있는 메소드
    static int add(){
        int result = 99 - 92;
        return result;
    }

    // 매개변수, 반환값 둘다 없는 메소드
    static void printAdd(){
        int result = 99 - 92;
        System.out.println("result = " + result);
    }

    // 매개변수가 2개, 반환값이 있는 메소드
    static int add(int number1, int number2){
        int result = number1 + number2;
        return result;
    }

    public static void main(String[] args) {

        System.out.println(">> 1. 매개변수, 반환값이 있는 메소드 호출 및 반환값 출력");
        int result = add(5);
        System.out.println("add(5) result = " + result);
        System.out.println();

        System.out.println(">> 2. 매개변수만 있는 메소드 호출");
        printAdd(3);
        System.out.println();

        System.out.println(">> 3. 반환값만 있는 메소드 호출 및 반환값 출력");
        result = add();
        System.out.println("add() result = " + result);
        System.out.println();

        System.out.println(">> 4. 매개변수, 반환값이 없는 메소드 호출");
        printAdd();
        System.out.println();

        System.out.println(">> 5. 매개변수가 두개, 반환값이 있는 메소드 호출 및 반환값 출력");
        result = add(11,22);
        System.out.println("add(11,22) result = " + result);
        System.out.println();

    }
}
