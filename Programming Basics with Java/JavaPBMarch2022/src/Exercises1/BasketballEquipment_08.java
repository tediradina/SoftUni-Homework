package Exercises1;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yearPrice = Integer.parseInt(scanner.nextLine());

        double shoes = yearPrice * 0.6;
        double ekip = shoes * 0.8;
        double ball = ekip / 4;
        double aksesoar = ball / 5;

        double finalPrice = yearPrice + shoes + ekip + ball + aksesoar;

        System.out.printf("%.2f", finalPrice);
    }
}
