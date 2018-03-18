package day15.diablo;

import day15.diablo.items.HealingPotion;
import day15.diablo.items.Item;
import day15.diablo.items.Sword;
import day15.diablo.items.Wand;

import java.util.Random;
import java.util.Scanner;

public class Launcher1 {
    public static void main(String[] args) {
        System.out.println("인벤토리 구조 테스트");

        Item healingPotion = new HealingPotion("회복약");
        Item sword = new Sword("단검");
        Item wand = new Wand("화염지팡이");

        DiabloCharacter magician = new DiabloCharacter("마법사");

        magician.addItem(healingPotion);
        magician.addItem(sword);
        magician.addItem(wand);

        System.out.println("// 인벤토리 리스트 출력");
        magician.printInventoryList();
        System.out.println();

        System.out.println("// 아이템 사용하기");
        magician.useItem(0);
        magician.useItem(1);
        System.out.println();

        System.out.println("// 아이템 장착하기");
        magician.equipItem(0);
        magician.equipItem(1);
        System.out.println();

        System.out.println("// 공격하기");
        magician.attack();

    }
}
