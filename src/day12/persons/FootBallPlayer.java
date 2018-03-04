package day12.persons;

public class FootBallPlayer extends Worker {

    public String teamName;

    public FootBallPlayer(String name, String sex, int age, int height, int weight , String teamName, long salary){
        super(name, sex, age, height, weight, salary);

        this.teamName = teamName;
    }

    public void playFootball(){
        System.out.println(name + "이 축구를 합니다.");
    }
}
