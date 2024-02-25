package Practice.Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Practice.Day14.Task1.txt");
        try {
            printResult(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        String line = input.nextLine();
        String[] numbersString = line.split(" ");
        double sumDigits = 0;
        int counter = 0;
        for (String number : numbersString) {
            sumDigits = sumDigits + Integer.parseInt(number);
            counter++;
        }
        double avg = sumDigits / counter;
        input.close();
        System.out.println(Arrays.toString(numbersString));
        System.out.println(avg);
    }
}
