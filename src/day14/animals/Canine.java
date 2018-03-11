package day14.animals;

public abstract class Canine extends Animal{

    public Canine(String name, int age, int weight) {
        super(name, age, weight);
    }
    public abstract void dig();
}
