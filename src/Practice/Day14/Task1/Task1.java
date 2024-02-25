package Practice.Day14.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Practice.Day14.Task1.txt");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (WrongInputFile e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException, WrongInputFile {
        Scanner input = new Scanner(file);
        String line = input.nextLine();
        String[] numbersString = line.split(" ");
        if (numbersString.length != 10) {
            throw new WrongInputFile();
        }
        int sumDigits = 0;
        for (String number : numbersString) {
            sumDigits = sumDigits + Integer.parseInt(number);
        }
        input.close();
        System.out.println(Arrays.toString(numbersString));
        System.out.println(sumDigits);
    }
}
