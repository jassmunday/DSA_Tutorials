public class patterns {
    public static void main(String[] args) {
        pattern30(5);
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int colForRow = row > n ? 2*n-row : row;
            for (int col = 0; col < colForRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {

            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }


}
