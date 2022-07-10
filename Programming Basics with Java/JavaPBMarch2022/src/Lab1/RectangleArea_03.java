package Lab1;

import java.util.Scanner;

public class RectangleArea_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        //намира лицето на правоъгълника - a * b
        System.out.println(a * b);
    }
}
