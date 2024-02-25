package Practice.Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("Practice.Day16.File1.txt");
        File file2 = new File("Practice.Day16.File2.txt");
        try {
            PrintWriter pW = new PrintWriter(file1);
            for (int i = 0; i < 1000; i++) {
                pW.print(Math.round(Math.random() * 100) + " ");
            }
            pW.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        try {
            Scanner input = new Scanner(file1);
            PrintWriter pW = new PrintWriter(file2);
            String line = input.nextLine();
            String[] numbersString = line.split(" ");
            double sumDigits = 0;
            int counter = 0;
            for (String number : numbersString) {
                sumDigits = sumDigits + Double.parseDouble(number);
                counter++;
                if (counter == 20) {
                    pW.println(String.format("%.1f ", sumDigits / counter).replaceAll(",", "."));
                    sumDigits = 0;
                    counter = 0;
                }
            }
            pW.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        try {
            printResult(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        String line = input.nextLine();
        String[] numbersString = line.split(" ");
        double sumDigits = 0;
        for (String number : numbersString) {
            sumDigits = sumDigits + Double.parseDouble(number);
        }
        input.close();
        System.out.printf("%.0f \n", sumDigits);
        System.out.println(Math.round(sumDigits));
    }
}
