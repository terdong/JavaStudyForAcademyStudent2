package day13.animals;

public class Cat extends Animal{
    private String variety;

    public Cat(String name, int age, String variety){
        super(name, age);
        this.variety = variety;
   }

   @Override
   public void printPet(){
        super.printPet();
       System.out.println("종류: " + variety);
   }
}
