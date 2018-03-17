package day15.diablo.items;

import day15.diablo.Equipment;

public class Sword extends Item implements Equipment{
    public Sword(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("검으로 베기를 시전합니다.");
    }
}
