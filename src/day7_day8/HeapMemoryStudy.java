package day7_day8;

public class HeapMemoryStudy {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "태형";

        Person person2 = new Person();

        person2 = person1;

        System.out.println("person2.name = " + person2.name);

    }
}
