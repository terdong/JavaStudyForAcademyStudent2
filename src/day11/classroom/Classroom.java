package day11.classroom;

public class Classroom {
    public static void main(String[] args) {
        Student kim = new Student(12, "김주현", 3);
        kim.test[0].setPoint("국어", 80);
        kim.test[1].setPoint("영어", 79);
        kim.test[2].setPoint("수학", 80);
        kim.printScore();
    }
}
