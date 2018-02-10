package day7;

public class PersonGenerator {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "정지영";
        person1.age = 12;
        person1.birthplace = "실험실";
        person1.sex = "남";
        person1.height = 150;
        person1.weight = 36;
        person1.printInfo();

        person2.name = "이서영";
        person2.age = 8;
        person2.birthplace = "실험실";
        person2.sex = "여";
        person2.height = 140;
        person2.weight = 30;
        person2.printInfo();

        person1.playDailyRoutine("햄버거","탄광","광부",5);
        person1.printInfo();

        person1.playDailyRoutine("짜장면","신문사","신문배달",3);
        person1.printInfo();

    }
}
