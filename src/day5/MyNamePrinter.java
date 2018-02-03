package day5;

public class MyNamePrinter {
    public static void main(String[] args) {
        int counter = 0;

        // 내 이름을 10번 출력하는
        // My name is DongHee Kim.
        System.out.println("My name is DongHee Kim.");

        // 1을 증가시키는 3가지 문법.
        //counter = counter + 1;
        //counter += 1;
        ++counter; // counter += 1 과 같은 구문입니다. 약식임.

        System.out.println("My name is DongHee Kim.");
        ++counter;
        System.out.println("My name is DongHee Kim.");
        ++counter;
        System.out.println("My name is DongHee Kim.");
        ++counter;
        System.out.println("My name is DongHee Kim.");
        ++counter;
        System.out.println("My name is DongHee Kim.");
        ++counter;
        System.out.println("My name is DongHee Kim.");
        ++counter;
        System.out.println("My name is DongHee Kim.");
        ++counter;
        System.out.println("My name is DongHee Kim.");
        ++counter;
        System.out.println("My name is DongHee Kim.");
        ++counter;
        System.out.println("My name is DongHee Kim.");
        ++counter;

        System.out.printf("counter = %d", counter);

        // counter 변수의 값이 10이상일 경우 "내 이름을 10번 출력했습니다."
        // 라고 출력 하는 프로그램을 작성해보세요.

        if(counter >= 1000){
            System.out.println("내 이름을 1000번 출력했습니다.");
        }
    }
}
