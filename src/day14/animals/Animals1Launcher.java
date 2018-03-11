package day14.animals;

public class Animals1Launcher {
    // 동물 객체를 짖게 하는 메소드
    public static void barkAnimal(Animal animal){
        animal.bark();
    }

    public static void main(String[] args) {
        //Cat cat = new Cat("고양이", 3, "코숏");
        Dog dog = new Dog("짱구", 2, 6,"믹스견");
        dog.printInfo();
        dog.dig();
        dog.bark();
        dog.eat("사료");
        dog.play();
        dog.shakeTail();

        System.out.println();

        Animal animal = dog;
        animal.bark();

        System.out.println();

        Canine canine = (Canine)animal;
        canine.dig();
        //canine.shakeTail();  이 코드는 에러가 납니다. 왜 날까요?

        barkAnimal(dog);

        // 다음 코드는 코드 작성 시에는 에러가 없지만, 실행 시 에러가 납니다.
        Feline feline = (Feline)animal;
        feline.grooming();
    }
}
