package day14.animals;

public abstract class Feline extends Animal{

    public Feline(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void grooming(){
        System.out.println("고양이과 동물이 그루밍을 합니다.");
    }
}
