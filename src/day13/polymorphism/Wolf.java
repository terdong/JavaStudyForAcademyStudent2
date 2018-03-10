package day13.polymorphism;

public class Wolf extends Animal{
    public Wolf(String name, int age, int weight){
        super(name, age, weight);
    }

    @Override
    public void bark(){
        System.out.println("아우~");
    }
}
