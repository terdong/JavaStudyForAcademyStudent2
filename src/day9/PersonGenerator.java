package day9;

public class PersonGenerator {
    public static void main(String [] args){

        Person person1 = new Person();

        person1.name = "클론1호";
        person1.age = 1;
        person1.height = 180;
        person1.weight = 60;
        person1.sex = "남자";
        person1.birthplace = "실헐심";

        //System.out.println(person1);

        person1.eat("짜장면");
        int pay = person1.work("낚시", 100000);
        System.out.println(person1.name + "님께서 " + pay + "원을 벌었습니다.");

        System.out.println();

        Person person2 = new Person();
        person2.name = "김동희";
        person2.age = 18;
        person2.height = 210;
        person2.weight = 80;
        person2.sex = "남";
        person2.birthplace = "화성";

        person2.eat("햄버거");
        pay = person2.work("프로그램을 가르치는", 1000000);
        System.out.println(person2.name + "님께서 " + pay + "원을 벌었습니다.");

        System.out.println();

        person1.printInfo();
        person2.printInfo();









    }
}
