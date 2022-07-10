package Lab3;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double sumCena = 0;

        switch (product){
            case "coffee":
                switch (city){
                    case "Sofia":
                        sumCena += 0.50;
                        break;

                    case "Plovdiv":
                        sumCena += 0.40;
                        break;

                    case "Varna":
                        sumCena += 0.45;
                        break;
                }
                break;

            case "water":
                switch (city){
                    case "Sofia":
                        sumCena += 0.80;
                        break;

                    case "Plovdiv":
                        sumCena += 0.70;
                        break;

                    case "Varna":
                        sumCena += 0.70;
                        break;
                }
                break;

            case "beer":
                switch (city){
                    case "Sofia":
                        sumCena += 1.20;
                        break;

                    case "Plovdiv":
                        sumCena += 1.15;
                        break;

                    case "Varna":
                        sumCena += 1.10;
                        break;
                }
                break;

            case "sweets":
                switch (city){
                    case "Sofia":
                        sumCena += 1.45;
                        break;

                    case "Plovdiv":
                        sumCena += 1.30;
                        break;

                    case "Varna":
                        sumCena += 1.35;
                        break;
                }
                break;

            case "peanuts":
                switch (city){
                    case "Sofia":
                        sumCena += 1.60;
                        break;

                    case "Plovdiv":
                        sumCena += 1.50;
                        break;

                    case "Varna":
                        sumCena += 1.55;
                        break;
                }
                break;
        }

        System.out.println(quantity * sumCena);

    }
}
