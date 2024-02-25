package Practice.Day04;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        double[] msv1 = new double[input.nextInt()];

        byte countNumbersGreaterThanEight = 0;
        byte countNumbersEqualToOne = 0;
        byte countNonOddNumbers = 0; //четные числа
        byte countOddNumbers = 0; //нечетные числа
        double sumOfMsv1 = 0;

        for (int i = 0; i < msv1.length; i++) {
            msv1[i] = Math.round(Math.random() * 10);
            sumOfMsv1 = sumOfMsv1 + msv1[i];
            System.out.printf("%.1f ", msv1[i]);

            if (msv1[i] > 8) {
                countNumbersGreaterThanEight++;
            }
            if (msv1[i] == 1) {
                countNumbersEqualToOne++;
            }
            if (msv1[i] % 2 == 0) {
                countNonOddNumbers++;
            }
            if (!(msv1[i] % 2 == 0)) {
                countOddNumbers++;
            }
        }
        System.out.println();
        System.out.println("Размер массива msv1 равен " + msv1.length);
        System.out.println("Количество чисел, больше 8 равно " + countNumbersGreaterThanEight);
        System.out.println("Количество чисел, равных 1 равно " + countNumbersEqualToOne);
        System.out.println("Количество четных чисел равно " + countNonOddNumbers);
        System.out.println("Количество нечетных чисел равно " + countOddNumbers);
        System.out.println("Сумма всех элементов массива равна" + sumOfMsv1);
    }
}
