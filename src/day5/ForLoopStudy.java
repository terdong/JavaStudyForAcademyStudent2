package day5;

public class ForLoopStudy {
    public static void main(String[] args) {

        // 내가 실행 시킬 반복 횟수를 저장한 변수
        int targetCount = 100;

        // 반복 카운트를 저장할 변수
        int i;
        for (i = 0; i < 10; ++i) {
            System.out.println(i + ": My name is DongHee Kim.");
        }

        if (i >= 10) {
            System.out.println("내 이름을 " + i + "번 출력했습니다.");
        }
    }
}
