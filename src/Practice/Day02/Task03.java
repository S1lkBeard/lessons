package Practice.Day02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¬ведите число a");
        int a = input.nextInt();
        System.out.println("¬ведите число b");
        int b = input.nextInt();
        System.out.println("„исла в диапазоне от " + a + " до " + b + ", которые дел€тс€ на 5 без остатка и на 10 с остатком:");
        int i = a;
        while (i <= b) {
            if ((i % 5 == 0) && !(i % 10 == 0)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
