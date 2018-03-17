package day15.animals;

public class PetLauncher1 {

    static void playOnlyPet(Pet pet){
        pet.play();
    }

    public static void main(String[] args) {

        //Pet pet = new Pet();

        Dog dog = new Dog();

        dog.play();
        dog.shakeTail();

        Animal animal = dog;

        //Pet pet = dog;
        Pet pet = (Pet)animal;
        pet.play();
        pet.shakeTail();
        playOnlyPet(dog);

        Hippo hippo = new Hippo("하마",2,200);
        // 하마는 Pet을 상속 받고 있지 않기 때문에 아래 코드가 불가능.
        //playOnlyPet(hippo);

/*
        Cat cat = new Cat("미미",1,15,"페르시안");
        cat.play();
        cat.shakeTail();
*/

    }
}
