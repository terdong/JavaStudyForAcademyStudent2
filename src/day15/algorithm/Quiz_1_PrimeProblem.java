package day15.algorithm;

public class Quiz_1_PrimeProblem {

    static void sample(){
        System.out.println("샘플용 메소드");
    }

    /*
    문제: 1 ~ 1000 까지 정수 중에 소수를 출력하고 총 개수를 출력하는 프로그램을 작성하세요.
    소수: 1과 자기 자신만으로 나누어지는 수
     */
    public static void main(String[] args) {
     /*   System.out.println("<<예시>>");
        System.out.println("소수:\n2\n3\n5\n7\n ... ");
        System.out.println("소수 총 개수: n개");*/

        int totalPrimeCount = 0;

        System.out.println("소수:");
        System.out.println("2");
        for(int i=3; i<=1000; i+=2){
            boolean isPrime = true;
            for(int j=2; j < i; ++j){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                ++totalPrimeCount;
                System.out.println(i);
            }
        }
        System.out.println("소수 총 개수: " + totalPrimeCount + "개");
    }
}
