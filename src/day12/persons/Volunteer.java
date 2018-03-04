package day12.persons;

public class Volunteer extends Person {

    public int workingTime;

    public Volunteer(String name, String sex, int age, int height, int weight, int workingTime){
        super(name, sex, age, height, weight);

        this.workingTime = workingTime;
    }

    public void helpSomething(){
        System.out.println("어떤 일이던지 도와줍니다.");
    }
}
