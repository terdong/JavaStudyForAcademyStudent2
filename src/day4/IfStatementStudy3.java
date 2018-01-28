package day4;

public class IfStatementStudy3 {
    public static void main(String[] args) {
        int s = 65;
        System.out.println("당신의 점수는 " + s + "점 입니다");

        if(s < 70){
            System.out.println("평균까지 앞으로 " + (70-s) + "점");
            System.out.println("힘내세요!!");
        }else
        {
            System.out.println("잘 하셨습니다.");
        }
    }
}
