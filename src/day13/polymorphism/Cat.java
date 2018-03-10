package day13.polymorphism;

public class Cat extends Animal{
    public Cat(String name, int age, int weight){
        super(name, age, weight);
    }

    @Override
    public void bark(){
        System.out.println("냐옹~");
    }
}
