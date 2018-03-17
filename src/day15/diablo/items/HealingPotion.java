package day15.diablo.items;

public class HealingPotion extends Item{

    public HealingPotion(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("캐릭터의 체력을 회복했습니다.");
    }
}
