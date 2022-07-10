package Exercises1;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nailon = Integer.parseInt(scanner.nextLine());
        int boq = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = Integer.parseInt(scanner.nextLine());

        double totalPrice = ((nailon+2) * 1.5) + ((boq + boq *0.1) * 14.5) + (razreditel * 5) + 0.4;
        double workPrice = totalPrice * 0.3 * hoursNeeded;
        double finalPrice = totalPrice + workPrice;

        System.out.printf("%.2f",finalPrice);

    }
}
