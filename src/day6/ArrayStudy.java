package day6;

public class ArrayStudy {
    public static void main(String[] args) {
        // 5개의 데이터를 저장 할 수 있는 배열 생성.
        // 초기값은 0으로 셋팅된다.
        int[] array = new int[9];

        System.out.println(">> 1. 배열 초기값 확인");
        System.out.println("array[0] = " + array[0]);
        System.out.println("array[1] = " + array[1]);
        System.out.println("array[2] = " + array[2]);
        System.out.println("array[3] = " + array[3]);
        System.out.println("array[4] = " + array[4]);
        System.out.println();

        System.out.println(">> 2. 배열의 길이를 출력해보자");
        System.out.println("array.length = " + array.length);
        System.out.println();

        System.out.println(">> 3. for문을 이용하여 배열 값 확인");
        for (int i = 0; i < array.length; ++i) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println();

        System.out.println(">> 4. 배열에 값을 저장해보고 출력.");
        array[1] = 11;
        array[8] = 88;
        array[4] = 45;
        for (int i = 0; i < array.length; ++i) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println();

        System.out.println(">> 5. 다른 방법으로 배열 생성하고 출력.");
        // 총 9개의 공간을 가지면서 해당 초기 값을 가지는 배열이 생성된다.
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array2.length; ++i) {
            System.out.println("array2[" + i + "] = " + array2[i]);
        }
        System.out.println();

        System.out.println(">> 6. 배열의 값을 for문으로 변경해 보기");
        // 배열 값 변경
        for( int i=0; i< array2.length; ++i){
            int number = array2[i];
            array2[i] = number * number;
        }
        // 변경한 배열 출력
        for (int i = 0; i < array2.length; ++i) {
            System.out.println("array2[" + i + "] = " + array2[i]);
        }
    }
}
