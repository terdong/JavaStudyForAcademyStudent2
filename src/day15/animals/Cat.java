package day15.animals;

public class Cat extends Feline implements Pet{
    private String variety;

    public Cat(String name, int age, int weight, String variety){
        super(name, age, weight);
        this.variety = variety;
   }

    @Override
    public void shakeTail() {
        System.out.println("고양이가 꼬리를 살랑살랑 흔듭니다.");
    }
    @Override
    public void play() {
        System.out.println("고양이가 주인과 함께 놉니다.");
    }
}
