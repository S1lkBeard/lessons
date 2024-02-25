package Practice.Day02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число x");
        double x = input.nextDouble();
        double y = 420;
        if (x >= 5) {
            y = ((Math.pow(x, 2) - 10) / (x + 7));

        } else if ((x > -3) && (x < 5)) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        }
        System.out.println("Значение функции y = " + y);
    }

}
