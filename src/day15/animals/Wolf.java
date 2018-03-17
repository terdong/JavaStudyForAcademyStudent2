package day15.animals;

public class Wolf extends Canine {

    public Wolf(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void dig() {
        System.out.println("늑대가 땅을 파서 고기를 묻습니다.");
    }

    @Override
    public void bark(){
        System.out.println("아우~");
    }

    public void howling(){
        System.out.println("늑대가 하울링을 시작합니다.");
    }

}
