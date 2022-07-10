package Exercises2;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point = Integer.parseInt(scanner.nextLine());
        double bonusPoint = 0.0;

        if (point <= 100){
            bonusPoint += 5;
        }else if(point > 1000) {
            bonusPoint = point * 0.1;
        }else {
            bonusPoint = point * 0.2;
        }

        if (point % 2 ==0){
            bonusPoint = bonusPoint + 1;
        }else if (point % 10 == 5){
            bonusPoint = bonusPoint + 2;
        }


        System.out.println(bonusPoint);
        System.out.println(point + bonusPoint);


        //Дадено е цяло число – начален брой точки. Върху него се начисляват бонус точки по правилата, описани по-долу.
        // Да се напише програма, която пресмята бонус точките, които получава числото и общия брой точки (числото + бонуса).
        //
        //· Ако числото е до 100 включително, бонус точките са 5.
        //· Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //· Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
        //· Допълнителни бонус точки (начисляват се отделно от предходните):
        //o За четно число à + 1 т.
        //o За число, което завършва на 5 à + 2 т.
    }
}
