package org.launchcode.java.studios;
import java.util.Scanner;

/**
 * Created by riz0 on 3/2/17.
 */
public class Area{
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        Double PI = 3.14;
        double radius = 0.0;

        while (radius == 0.0) {

            System.out.println("Enter a radius: ");
            radius = scanner.nextDouble();

            Double area = Math.PI * radius * radius;
            System.out.println("The area of the circle: " + area);
            radius = 0.0;
        }
    }
}