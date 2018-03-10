package day13.polymorphism;

public class Dog extends Animal{
    public Dog(String name, int age, int weight){
        super(name, age, weight);
    }

    @Override
    public void bark(){
        System.out.println("멍멍!");
    }

    public void shakeTail(){
        System.out.println("강아지가 꼬리를 격렬하게 흔듭니다.");
    }
}
