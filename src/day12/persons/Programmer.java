package day12.persons;

public class Programmer extends Worker {

    public String goodProgramLanguage;

    public Programmer(String name, String sex, int age, int height, int weight , String goodProgramLanguage, long salary){

        super(name, sex, age, height, weight, salary);
        this.goodProgramLanguage = goodProgramLanguage;

    }

    public void developProgram(){
        System.out.println(name + "이 프로그래밍을 합니다.");
    }
}
