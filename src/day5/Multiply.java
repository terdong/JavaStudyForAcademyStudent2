package day5;

// 교재 75 페이지 참조
public class Multiply {
    public static void main(String[] args) {
        int i, j;

        for( j=1; j<=9; ++j){

            for(i=1; i <=9; ++i){
                System.out.println(j + "x" + i + " = " + j * i);
            }

            System.out.println();
        }
    }
}
