package MoreExercises_1;

import java.util.Scanner;

public class TriangleArea_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double hA = Double.parseDouble(scanner.nextLine());

        double area = a * hA /2;

        System.out.printf("%.2f", area);
    }
}
