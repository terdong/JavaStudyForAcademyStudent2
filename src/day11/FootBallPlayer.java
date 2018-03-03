package day11;

public class FootBallPlayer extends Person  {

    public String teamName;
    public long salary;

    public FootBallPlayer(String name, String sex, int age, int height, int weight , String teamName, long salary){
        super(name, sex, age, height, weight);

        this.teamName = teamName;
        this.salary = salary;
    }
}
