package Exercises1;

import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radiana = Double.parseDouble(scanner.nextLine());

        double gradus = radiana * 180/Math.PI;

        System.out.println(gradus);

    }
}
