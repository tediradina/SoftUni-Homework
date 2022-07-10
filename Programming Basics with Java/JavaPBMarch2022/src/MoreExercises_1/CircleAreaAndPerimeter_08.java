package MoreExercises_1;

import java.util.Scanner;

public class CircleAreaAndPerimeter_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * r *r;
        double parameter = 2 * Math.PI * r;

        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f%n",parameter);
        //Напишете програма, която чете от конзолата число r и пресмята и отпечатва лицето и периметъра на кръг /
        // окръжност с радиус r, като форматирате изхода в следния вид: "<calculated area>"
        //"<calculated parameter>". Форматирайте изходните данни до втория знак след десетичната запетая.
    }
}
