package day15.diablo.items;

import day15.diablo.Equipment;

public class Wand extends Item implements Equipment {
    public Wand(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("지팡이로 화염구를 날립니다.");
    }
}
