package MoreExercises_1;

import java.util.Scanner;

public class CelsiusToFahrenheit_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degreeC = Double.parseDouble(scanner.nextLine());
        double degreeF = degreeC * 1.8 + 32;

        System.out.printf("%.2f", degreeF);

    }
}
