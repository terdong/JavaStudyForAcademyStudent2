package day15.diablo;

import day15.diablo.items.HealingPotion;
import day15.diablo.items.Item;
import day15.diablo.items.Sword;
import day15.diablo.items.Wand;

import java.util.Random;
import java.util.Scanner;

public class Launcher {
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

        magician.attack();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Item item = null;

        for(;;){
            System.out.println("명령어 출력: 1. 아이템 랜덤 생성, 2. 아이템 추가, 3. 인벤토리 출력. 4. 아이템 사용, 5. 아이템 장착");
            int command = scanner.nextInt();
            if(command == 1){
                int randomNumber = random.nextInt(3);
                if(randomNumber == 0){
                    item = new HealingPotion("회복약");
                }else if(randomNumber == 1){
                    item = new Sword("단검");
                }else if(randomNumber == 2){
                    item = new Wand("화염지팡이");
                }
                System.out.println(item + "이 생성 되었습니다. 추가 하실려면 명령어를 입력해주세요.");
            }else if(command == 2){

            }

        }



    }
}
