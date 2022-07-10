package MoreExercises_1;

import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkumriq = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        int kgMidi = Integer.parseInt(scanner.nextLine());

        double pricePalamud =priceSkumriq +  priceSkumriq * 0.6;
        double priceSafrid = priceCaca + priceCaca * 0.8;

        double sumSafrid = priceSafrid * kgSafrid;
        double sumPalamud = kgPalamud * pricePalamud;
        double sumMidi = kgMidi * 7.50;

        double totalPrice = sumMidi + sumSafrid + sumPalamud;
        System.out.printf("%.2f", totalPrice);

    }
}
