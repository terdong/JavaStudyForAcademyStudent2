package day13.statics;

public class Shopping {
    public static final String TITLE = "쇼핑 프로그램";
    public static final int MAX_MONEY = 99999;

    public static void main(String[] args) {

        System.out.println(TITLE);

      /*  Purse store1 = new Purse();
        Purse store2 = new Purse();

        store1.printMoney(1000, 180);
        store2.printMoney(0, 250);
        store1.printMoney(0, 800);*/

      // 메소드에 static 키워드를 붙임으로써 객체 생성 안하고도 메소드 호출이 가능하다.
     /*   Purse.printMoney(1000, 180);
        Purse.printMoney(0, 250);
        Purse.printMoney(0, 800);*/
    }
}
