package day10;

public class Dog {
  /*  //데이터
    이름(name)
    나이(age)
    종류(type)
    몸무게(weight)*/
    String name;
    String type;
    int age;
    int weight;

    void setInfo(String name, String type, int age, int weight){
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    // 짖기(bark): 몸무게에 따라서 1 ~ 5kg: "앙앙", 6 ~ 10kg:"왈왈", 11kg ~ : "멍멍"
    void bark(){
        if(weight >= 1 && weight <= 5 ){
            System.out.println("앙앙!!");
        }else if(weight >= 6 && weight <= 10){
            System.out.println("왈왈!!");
        }else if(weight > 10){
            System.out.println("멍멍!!");
        }
    }

    // 먹기(eat): 해당 문구를 출력하세요. "xx를 맛있게 먹습니다.". (xx는 매개변수)
    void eat(String food){
        System.out.println(food + "를 맛있게 먹습니다.");
    }

    // 오버로드 메소드
    void eat(){
        System.out.println("사료를 맛있게 먹습니다.");
    }

    // 자기(sleep): 해당 문구를 출력하세요. "[강아지이름]이 잡니다."
    void sleep(){
        System.out.println(name + "이 쿨쿨 잡니다.");
    }

    void printInfo(){
        System.out.println("이름: " + this.name);
        System.out.println("종: " + this.type);
        System.out.println("나이: " + this.age + "살");
        System.out.println("몸무게: " + this.weight + "kg");
        System.out.println();
    }
}
