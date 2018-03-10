package day13.animals;

 public class Pet {
    public static void main(String[] args) {
        Cat cat = new Cat("양순이", 5, "페르시안");
        cat.printPet();

        System.out.println();

        Dog dog = new Dog("또치", 3, "요크셔테리어");
        dog.printPet();
    }
}
