package day15.diablo;

import day15.diablo.items.Item;

public class DiabloCharacter {

    private String name;

    private Item[] inventory;
    private int indexForAdding;

    private Equipment leftHand;

    public DiabloCharacter(String name) {
        this.name = name;
        inventory = new Item[5];
    }

    public void addItem(Item item) {
        if (indexForAdding < inventory.length) {
            inventory[indexForAdding++] = item;
            System.out.println(item + "을(를) 획득했습니다.");
        } else {
            System.out.println("더 이상 아이템을 획득 할 수 없습니다.");
        }
    }

    public void printInventoryList() {
        for (int i = 0; i < indexForAdding; ++i) {
            Item item = inventory[i];
            System.out.println(i + " : " + item);
        }
    }

    public void useItem(int index) {
        if (index < indexForAdding) {
            inventory[index].use();
        } else {
            System.out.println("없는 아이템 번호 입니다.");
        }
    }

    public void equipItem(int index) {
        if (index < indexForAdding) {
            Item item = inventory[index];
            if (item instanceof Equipment) {
                leftHand = (Equipment) item;
                System.out.println("이 아이템(" + item + ")을 장착 했습니다.");
            } else {
                System.out.println("이 아이템(" + item + ")은 장착 할 수 없는 아이템 입니다.");
            }
        } else {
            System.out.println("없는 아이템 번호 입니다.");
        }
    }

    public void attack() {
        if (leftHand != null) {
            leftHand.attack();
        } else {
            System.out.println("맨손 공격을 합니다.");
        }
    }
}
