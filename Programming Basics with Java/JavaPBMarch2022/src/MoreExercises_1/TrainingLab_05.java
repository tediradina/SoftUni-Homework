package MoreExercises_1;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        double wSpace = (w * 100  - 100);
        double freeSpaceForDeskW =  Math.floor(wSpace / 70);

        double hSpace = h * 100;
        double freeRedoveForDeskH = Math.floor(hSpace / 120);

        double countDesk = freeRedoveForDeskH * freeSpaceForDeskW - 3;

        System.out.printf("%.0f", countDesk);




        //Залата е широка 890 cm. От тях 100 cm отиват за коридора в средата.
        // В останалите 790 cm могат да се разположат по 11 бюра на ред (11 * 70 cm = 770 cm + 20 cm остатък).
        //Залата е дълга 1500 cm. В тях могат да бъдат разположени 12 реда (12 * 120 cm = 1440 + 60 cm остатък).
        //Брой места = 12 * 11 - 3 =  132 - 3 = 129 (имаме 12 реда по 11 места = 132 минус 3 места за катедра и входна врата).
    }
}
