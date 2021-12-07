import java.util.Scanner;
public class HollowSquareStarPattern {
    static void Squarestar(int r, int c) {
        int a, b;

        for (a = 1; a <= r; a++)
        {
            for (b = 1; b <= c; b++)
            {
                if (a == 1 || a == r || b == 1 || b == c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number of rows of pyramid star you want to print: ");
        int row = sc.nextInt();
        int column = row ;
        Squarestar(row, column);

    }

}


