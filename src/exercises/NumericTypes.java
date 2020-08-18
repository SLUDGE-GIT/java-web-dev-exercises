package exercises;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        double length;
        double width;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle");
        length = input.nextDouble();
        System.out.println("Enter the width of the Rectangle");
        width = input.nextDouble();
        input.close();

        double area = length*width;
        System.out.println("Area of the Rectangle is: "+area);

    }
}
