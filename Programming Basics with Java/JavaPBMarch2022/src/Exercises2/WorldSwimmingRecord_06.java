package Exercises2;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double razstoqnieMetri = Double.parseDouble(scanner.nextLine());
        double pluva1MeturZaSecundi = Double.parseDouble(scanner.nextLine());


// Да се напише програма, която изчислява дали се е справил със задачата, като се има предвид, че:
// съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди. Когато се изчислява колко пъти Иван ще се забави,
// в резултат на съпротивлението на водата, резултатът трябва да се закръгли надолу до най-близкото цяло число.
//Да се изчисли времето в секунди, за което Иван ще преплува разстоянието и разликата спрямо Световния рекорд.

        double zabavqne = (Math.floor(razstoqnieMetri / 15)) * 12.5;
        double pluvaZa = razstoqnieMetri * pluva1MeturZaSecundi;

        double sumVreme =(zabavqne + pluvaZa);
        double diff = Math.abs(record - sumVreme);


        if (record > sumVreme){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sumVreme);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }


    }
}
