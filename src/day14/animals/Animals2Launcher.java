package day14.animals;

public class Animals2Launcher {
    public static void main(String[] args) {

        Animal [] animals = new Animal[4];

        animals[0] = new Dog();
        animals[1] = new Cat("고냥",1,2,"코숏");
        animals[2] = new Tiger("호랭이", 1, 100);
        animals[3] = new Hippo("하마", 1, 300);

        for(int i=0; i<animals.length; ++i){
            animals[i].printInfo();
        }

        System.out.println();

        Canine [] canines = new Canine[3];
        canines[0] = new Wolf("늑돌이", 1, 80);
        canines[1] = new Dog();
        canines[2] = new Dog("똘똘이", 5, 15, "슈나우져");
        //canines[2] = new Cat("고야고양", 1,2,"코숏");
        for(int i=0; i<canines.length; ++i){
            canines[i].printInfo();
        }



    }
}
