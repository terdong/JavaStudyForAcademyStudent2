package day11.classroom;

public class Student {
    int id;
    String name;
    int subnum;
    Test [] test;

    Student(int id, String name, int subNum){
        this.id = id;
        this.name = name;
        this.subnum = subnum;
        test = new Test[subnum];
        for(int i = 0; i< subnum; ++i){
            test[i] = new Test();
        }
    }

    String getName(){
        return id + ":" + name;
    }

    int getGrade() {
        int sum = 0;
        for(int i=0; i<subnum; ++i){
            sum += test[i].point;
        }
        return sum;
    }

    int getGrade(int rank){
        int base = 100 * subnum / rank;
        rank = getGrade() / base + 1;
        return rank;
    }

    void printScore() {
        System.out.println(getName());
        for(int i=0; i<subnum; ++i){
            System.out.println(test[i].getPoint() + " ");
        }
        System.out.println();
        System.out.println("총점: " + getGrade());
        int rank = 5;
        System.out.println(rank + "단계평가: " + getGrade(rank));
        System.out.println();
    }
}
