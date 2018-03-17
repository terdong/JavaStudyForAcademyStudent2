package day15.animals;

public abstract class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void bark(){
        System.out.println(name + "가(이) 짖습니다.");
    }

    public void eat(String food){
        System.out.println(name + "가(이) " + food + "를 먹습니다.");
    }

    public void printInfo(){
        System.out.println("이름: " + name + ", 나이: " + age + "살, 몸무게: " + weight + "kg");
    }
}
