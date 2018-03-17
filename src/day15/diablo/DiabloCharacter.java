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
        } else {
            System.out.println("더 이상 아이템을 획득 할 수 없습니다.");
        }
    }

    public void printInventoryList() {
        for (int i = 0; i < indexForAdding - 1; ++i) {
            Item item = inventory[i];
            System.out.println(i + " : " + item);
        }
    }

    public void useItem(int index) {
        inventory[index].use();
    }

    public void equipItem(int index) {
        Item item = inventory[index];
        if(item instanceof Equipment) {
            leftHand = (Equipment) item;
            System.out.println("이 아이템(" + item + ")을 장착 했습니다.");
        }else{
            System.out.println("이 아이템(" + item + ")은 장착 할 수 없는 아이템 입니다.");
        }
    }

    public void attack(){
        leftHand.attack();
    }
}
