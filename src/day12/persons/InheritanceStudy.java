package day12.persons;

public class InheritanceStudy {
    public static void main(String[] args) {

        Person person = new Person("정우성", "남자", 44, 186, 80);

        FootBallPlayer footBallPlayer = new FootBallPlayer("손흥민", "남자", 25, 183, 77, "토트넘", 10600000000l);

        Programmer programmer = new Programmer("제임스 고슬링", "남자", 62, 180, 90, "자바", 5000000000l);

        Volunteer volunteer = new Volunteer("테레사", "여자", 60, 165, 50, 99999);

        person.eat("짜장면");
        person.work();

        footBallPlayer.eat("햄버거");
        footBallPlayer.work();

        programmer.eat("피자");
        programmer.work();

        volunteer.eat("샌드위치");
        volunteer.helpSomething();


    }
}
