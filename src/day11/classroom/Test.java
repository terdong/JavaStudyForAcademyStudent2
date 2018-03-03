package day11.classroom;

public class Test {
    String subject;
    int point;

    void setPoint(String subject, int point){
        this.subject = subject;
        this.point = point;
    }

    String getPoint(){
        return subject + ":" + point;
    }
}
