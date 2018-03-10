package day13.statics;

public class Purse {
    public static int money = 0;

    public void printMoney(int in, int out){
        money = money + in - out;
        if(money < 0){
            System.out.println((-1 * money) + "원 부족합니다.");
        }else{
            System.out.println("잔금은 " + money + "원입니다.");
        }
    }
}
