package day13.polymorphism;

public class AnimalLauncher {

    // 동물 객체를 짖게 하는 메소드
    public static void barkAnimal(Animal animal){
        animal.bark();
    }

    // 동물 객체를 짖게 하는 메소드 + 개의 꼬리를 흔들게 하는 메소드
    public static void barkAnimalForDog(Animal animal){
        animal.bark();
        Dog dog = (Dog)animal;
        dog.shakeTail();
        //animal.shakeTail();
    }

/*    public static void barkCat(Cat cat){
        cat.bark();
    }

    public static void barkDog(Dog dog){
        dog.bark();
    }

    public static void barkHippo(Hippo hippo){
        hippo.bark();
    }*/

    public static void main(String[] args) {
        Cat cat = new Cat("고양이", 3, 8);
        Dog dog = new Dog("강아지", 4, 5);
        Hippo hippo = new Hippo("하마", 11, 200);
        Wolf wolf = new Wolf("늑대", 1, 80);

        cat.printInfo();
        dog.printInfo();
        hippo.printInfo();
        wolf.printInfo();

        System.out.println();

        cat.bark();
        dog.bark();
        wolf.bark();

        System.out.println("=======================================");

        Animal animal;
        animal = cat;
        animal.bark();

        animal = hippo;
        animal.bark();

        System.out.println("=======================================");

        barkAnimal(cat);
        barkAnimal(dog);
        barkAnimal(hippo);

        System.out.println("========== dog.shakeTail(); =============================");

        dog.shakeTail();

        System.out.println("========= barkAnimalForDog(animal); ==============================");

        animal = dog;

        barkAnimalForDog(animal);

        //animal.shakeTail();


    }
}
