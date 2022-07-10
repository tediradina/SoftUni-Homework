package Lab2;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        double area = 0;

        if(shape.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());

            area = a * a;

        }else if(shape.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());

            area = a * b;

        }else if(shape.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());

            area = Math.PI * radius * radius;

        }else if(shape.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double aHeight = Double.parseDouble(scanner.nextLine());

            area = a * aHeight / 2;

        }

        System.out.printf("%.3f",area);

    }
}
