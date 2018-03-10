package day13.animals;

public class Dog extends Animal{
    private String variety;

    public Dog(String name, int age, String variety){
        super(name, age);
        this.variety = variety;
    }

    @Override
    public void printPet(){
        super.printPet();
        System.out.println("종류: " + variety);
    }

}
