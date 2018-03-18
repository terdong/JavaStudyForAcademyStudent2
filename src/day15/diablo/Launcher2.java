package day15.diablo;

import day15.diablo.items.HealingPotion;
import day15.diablo.items.Item;
import day15.diablo.items.Sword;
import day15.diablo.items.Wand;

import java.util.Random;
import java.util.Scanner;

public class Launcher2 {
    public static void main(String[] args) {
        System.out.println("인벤토리 시뮬레이터 실행");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        DiabloCharacter magicion = new DiabloCharacter("마법사");

        Item item = null;

        for(;;){
            System.out.println("########################################################################");
            System.out.println("명령어 목록: 1. 아이템 랜덤 생성, 2. 아이템 추가, 3. 인벤토리 출력. 4. 아이템 사용, 5. 아이템 장착, 6. 공격");
            System.out.print("입력: ");
            int command = scanner.nextInt();
            System.out.print("결과: ");
            if(command == 1){
                int randomNumber = random.nextInt(3);
                if(randomNumber == 0){
                    item = new HealingPotion("회복약");
                }else if(randomNumber == 1){
                    item = new Sword("단검");
                }else if(randomNumber == 2){
                    item = new Wand("화염지팡이");
                }
                System.out.println(item + "이(가) 생성 되었습니다. 추가 하실려면 명령어를 입력해주세요.");
            }else if(command == 2){
                if(item != null){
                    magicion.addItem(item);
                }else{
                    System.out.println("생성된 아이템이 없습니다. 아이템을 먼저 생성해주세요.");
                }
            }else if(command == 3){
                System.out.println();
                magicion.printInventoryList();
            }else if(command == 4){
                System.out.print("사용할 아이템 번호 입력: ");
                int index = scanner.nextInt();
                magicion.useItem(index);
            }else if(command == 5){
                System.out.print("장착할 아이템 번호 입력: ");
                int index = scanner.nextInt();
                magicion.equipItem(index);
            }else if(command == 6){
                magicion.attack();
            }else{
                System.out.println("잘못 입력하셨습니다. 올바른 명령어를 입력해주세요.");
            }
        }
    }
}
