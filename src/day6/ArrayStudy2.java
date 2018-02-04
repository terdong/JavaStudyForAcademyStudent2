package day6;

public class ArrayStudy2 {
    public static void main(String[] args) {

        int[][] array = new int[3][4];

        array[0][3] = 9;
        array[1][2] = 8;
        array[2][1] = 7;

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
            }
        }
    }
}
