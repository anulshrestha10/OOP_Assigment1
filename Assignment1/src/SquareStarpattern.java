import java.util.Scanner;
public class SquareStarpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many number of rows and columns of star you want to print: ");
        int row_column = s.nextInt();

        for(int i = 1; i <= row_column; i++)
        {
            for(int j = 1; j <= row_column; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

