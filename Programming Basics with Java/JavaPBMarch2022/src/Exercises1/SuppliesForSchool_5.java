package Exercises1;

import java.util.Scanner;

public class SuppliesForSchool_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int penPackageCount = Integer.parseInt(scanner.nextLine());
        int markerPackageCount = Integer.parseInt(scanner.nextLine());
        int preparatLitri = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double totalPrice = (penPackageCount * 5.80) + (markerPackageCount * 7.2) + (preparatLitri * 1.2);
        double discount = totalPrice * percent/100;
        double finalPrice = totalPrice - discount;

        System.out.printf("%f",finalPrice );
    }
}
