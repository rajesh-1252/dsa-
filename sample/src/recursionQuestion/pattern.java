package recursionQuestion;

public class pattern {
    public static void main(String[] args) {
        pattern6(5);
    }
    // --------------------------------------------------------//

    // triangle pattern

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    // ----------------------------------------------------------//

    // box pattern

    // *****
    // *****
    // *****
    // *****
    // *****
    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ----------------------------------------------------------//

    // inverted triangle

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    static void pattern3(int n) {
        for (int row = n; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    // ----------------------------------------------------------//

    // number triange

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    // ---------------------------------------------------------//

    // two triangle

    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    static void pattern5(int n) {
        for (int row = 0; row <= n * 2; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalCol; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // ---------------------------------------------------------//
    // Diamond
    // formatted wrongly code working fine
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalCol;
            for (int space = 0; space < noOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
