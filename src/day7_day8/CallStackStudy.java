package day7_day8;

public class CallStackStudy {

    static void printMessage(String message){
        System.out.println("입력하신 메세지는 \"" + message + "\" 입니다.");
    }

    static int add(int a, int b){
        return a + b;
    }

    static void operator(char operation, int a, int b){
        if(operation == '+'){
            int result = add(a, b);
            System.out.println("result = " + result);
        }else{
            System.out.println("이 메소드는 현재 '+' 연산자만 지원합니다.");
        }
    }

    static void callA(){
        System.out.println("A 메소드 호출 중");
        callB();
    }

    static void callB(){
        System.out.println("B 메소드 호출 중");
        callA();
    }

    public static void main(String[] args) {

        printMessage("오늘 날씨가 참 변덕스럽군요.");

        operator('+', 3, 4);

        callA();

    }
}
