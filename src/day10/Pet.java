package day10;

public class Pet {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        // 데이터 값을 세팅하는 메소드를 만들어보세요.

        dog1.setInfo("루시", "미니어쳐 푸들", 3, 4);
        dog1.bark();
        dog1.eat("닭 가슴살");
        dog1.eat();
        dog1.sleep();
        dog1.printInfo();

        Dog dog2 = new Dog();
        dog2.setInfo("해피", "진도개", 5, 9);

        dog2.bark();
        dog2.eat("소고기");
        dog2.sleep();
        dog2.printInfo();

        // 고양이(Cat) 클래스를 만들어보고 객체생성해보세요.
        // Dog 클래스에다가 성별 데이터까지 넣어보세요.
        // 그리고 doGrooming 메소드도 만들어서 "[고양이 이름]이 그루밍을 합니다." 라는 메시지를 출력하세요.
    }
}
