package day7_day8;

public class Person {
    // 멤버 변수를 선언해준다.
    String name; // 이름
    String sex; // 성별
    int age; // 나이
    String birthplace; // 출생지
    int height; // 키
    int weight; // 몸무게

    // 먹다
    void eat(String foodName){
        System.out.println(name + "님께서 " + foodName + "을 먹습니다.");
    }

    // 자다
    void sleep(){
        System.out.println(name + "님께서 잡니다");
    }

    // 이동하다
    void move(String place){
        System.out.println(name + "님께서 " + place + "을(를) 갑니다");
    }

    // 일하다
    int work(String job, int pay){
        System.out.println(name + "님께서 " + job + " 일을 합니다.");
        return pay - (pay * (1 / 5));
    }

    // 신상정보 출력
    void printInfo(){
        System.out.println("이름: " + name);
        System.out.println("성별: " + sex);
        System.out.println("나이: " + age + "살");
        System.out.println("출생지: " + birthplace);
        System.out.println("키: " + height + "cm");
        System.out.println("몸무게: " + weight + "kg");
        System.out.println();
    }

    // 하루 일과
    void playDailyRoutine(String foodName, String place, String job, int pay){
        eat(foodName);
        move(place);
        pay = work(job, pay);
        System.out.println(name + "님께서 일당 " + pay + "만원을 받았습니다.");
        sleep();

        age += 1;
        height += 5;
        weight += 10;
    }
}
