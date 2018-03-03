package day11;

public class Programmer extends Person{

    public long salary;
    public String goodProgramLanguage;

    public Programmer(String name, String sex, int age, int height, int weight , String goodProgramLanguage, long salary){

        super(name, sex, age, height, weight);
        this.goodProgramLanguage = goodProgramLanguage;
        this.salary = salary;
    }
}
