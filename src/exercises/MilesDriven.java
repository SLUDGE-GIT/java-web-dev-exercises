package exercises;

import java.util.Scanner;

public class MilesDriven {

    public static void main(String[] args) {
        double miles;
        double gallons;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter miles driven");
        miles = input.nextDouble();
        System.out.println("Enter how much gas consumed (in Gallons)");
        gallons = input.nextDouble();
        input.close();

        double mpg = (miles / gallons);
        System.out.println("Your miles-per-gallon is: "+mpg);

    }
}