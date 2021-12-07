import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prime_num;
        int num;


        System.out.print("Enter prime numbers upto how much you want to print:");
        prime_num = sc.nextInt();

        for (int i=2;i<prime_num;i++){
            num = 0;
            for (int j=2;j<i;j++){
                if (i%j==0)
                    num=1;

            }
            if (num==0)
                System.out.println(i);


        }

    }


}
