package day14.animals;

import day13.animals.Animal;

public class Cat extends Feline{
    private String variety;

    public Cat(String name, int age, int weight, String variety){
        super(name, age, weight);
        this.variety = variety;
   }

    public void shakeTail(){
        System.out.println("고양이가 꼬리를 살랑살랑 흔듭니다.");
    }

    public void play(){
        System.out.println("고양이가 주인과 함께 놉니다.");
    }

}
