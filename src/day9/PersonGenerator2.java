package day9;

public class PersonGenerator2 {
    public static void main(String [] args){

        Person person1 = new Person();
        person1.name = "태형";

        System.out.println(person1.name);

        Person person2;
        person2 = person1;
        person2.name = "강타";

        System.out.println(person1.name);

        person1 = null;
        //person1.name = "태형"; 이 코드는 실행시 에러가 납니다.

        person2.name = "태형";

        System.out.println(person2.name);
    }
}
