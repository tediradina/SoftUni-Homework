package Exercises2;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStatisti = Integer.parseInt(scanner.nextLine());
        double priceForStatist = Double.parseDouble(scanner.nextLine());

    //Снимките за дългоочаквания филм "Годзила срещу Конг" започват. Сценаристът Адам Уингард ви моли да напишете програма,
    // която да изчисли дали предвидените средства са достатъчни за снимането на филма. За снимките ще бъдат нужни определен брой статисти,
    // облекло за всеки един статист и декор.
    //Известно е, че:
    //· Декорът за филма е на стойност 10% от бюджета.
    //· При повече от 150 статиста, има отстъпка за облеклото на стойност 10%.

        double dekor = budget * 0.1;
        double sumPriceStatist = countStatisti * priceForStatist;
        if (countStatisti > 150){
            sumPriceStatist = sumPriceStatist - (sumPriceStatist * 0.1);
        }

        double totalPrice = sumPriceStatist + dekor;
        double diff = Math.abs(budget - totalPrice);

        if (totalPrice > budget){
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.%n", diff);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }

    }
}
