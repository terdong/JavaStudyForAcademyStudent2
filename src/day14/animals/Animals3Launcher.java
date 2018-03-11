package day14.animals;

// 추상클래스 연습
public class Animals3Launcher {
    public static void main(String[] args) {

        // 추상 클래스는 객체 생성이 안된다.
/*        Animal animal = new Animal("동물??",0,0);
        animal.printInfo();

        Canine canine = new Canine("??", 0, 0);
        canine.printInfo();*/

        Dog dog = new Dog();
        dog.dig();

        Wolf wolf = new Wolf("늑돌이",1,100);
        wolf.dig();

    }
}
