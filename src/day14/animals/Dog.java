package day14.animals;

import day13.animals.Animal;

public class Dog extends Canine{
    private String variety;

    public Dog(){
        super("강아지", 1,2);
        this.variety = "진도개";
    }

    public Dog(String name, int age, int weight, String variety){
        super(name, age, weight);
        this.variety = variety;
    }

    @Override
    public void bark(){
        System.out.println("멍멍!");
    }

    @Override
    public void dig(){
        System.out.println("강아지가 땅을 파서 장난감을 묻습니다.");
    }

    public void shakeTail(){
        System.out.println("강아지가 꼬리를 격렬하게 흔듭니다.");
    }

    public void play(){
        System.out.println("강아지가 주인과 함께 놉니다.");
    }

}
