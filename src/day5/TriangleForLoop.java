package day5;

// 별모양으로 삼각형 찍는 프로그램
public class TriangleForLoop {
    public static void main(String[] args) {

        // 1. 중첩 for문을 이용하여 *모양으로된 직각삼각형을 그려보세요.

        for (int i = 0; i < 5; ++i) {
            System.out.println("*");
        }

        System.out.println();

        // 사각형 찍는 코드
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 직각 삼각형 찍는 코드
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 2. 중첩 for문을 이용하여 *모양으로된 역직각삼각형을 그려보세요.
        for (int i = 0; i < 5; ++i) {
            for (int j = 5; j > i; --j) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. 중첩 for문을 이용하여 *모양으로된 좌우로 반전된 직각삼각형을 그려보세요.
        for (int i = 0; i < 5; ++i) {
            for (int j = 5; j > i; --j) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4. 중첩 for문을 이용하여 *모양으로된 이등변 삼각형을 그려보세요.

        // 5. 중첩 for문을 이용하여 *모양으로된 별(star)을 그려보세요.
        // 힌트: 기존에 그렸던 삼각형들을 응용하면 됩니다.

    }
}
