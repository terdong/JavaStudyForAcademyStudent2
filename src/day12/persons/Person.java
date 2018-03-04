package day12.persons;

public class Person {
    public String name;
    public String sex;
    public int age;
    public int height;
    public int weight;

    public Person(String name, String sex, int age, int height, int weight ){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void eat(String food){
        System.out.println(name + "이(가) " + food + "를(을) 먹습니다.");
    }

    public void work(){
        System.out.println(name + "이(가) " + "일합니다.");
    }
}
