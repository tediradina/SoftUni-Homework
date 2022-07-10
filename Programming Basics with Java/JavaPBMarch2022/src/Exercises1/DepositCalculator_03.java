package Exercises1;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depozit = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double totalPrice = depozit + month * ((depozit * procent/100) / 12);

        System.out.printf("%.2f", totalPrice);

    }
}
