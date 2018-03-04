package day12.persons;

public class Worker extends Person{
    long salary;

    public Worker(String name, String sex, int age, int height, int weight, long salary){
        super(name, sex, age, height, weight);
        this.salary = salary;
    }

    public void getPay(long salary){
        this.salary = salary;
    }
}
