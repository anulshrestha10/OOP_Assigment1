//Write a Java program to compute body massindex (BMI).
// Note: The formula is BMI = kg/m2where kg is a person's weight in kilograms
// and m2is their height in metres squared.
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the height in metre:");
        double height = s.nextDouble();
        System.out.println("Enter the weight in kg:");
        double weight = s.nextDouble();

        double BMI = weight / (height*height) ;
        System.out.println("The BMI is " + BMI);
    }

}