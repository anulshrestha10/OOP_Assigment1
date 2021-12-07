import java.util.Scanner;
public class InvertedPyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number of rows of inverted pyramid star you want to print: ");
        int rows = sc.nextInt();

        for(int i = rows; i >= 1; --i) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
