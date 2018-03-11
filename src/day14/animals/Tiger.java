package day14.animals;

public class Tiger extends Feline{

    public Tiger(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void claw(){
        System.out.println("호랑이가 사냥감을 할큅니다.");
    }
}
