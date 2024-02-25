package Lessons.Lesson37_Reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson37_Reading {
    public static void main(String[] args) throws FileNotFoundException {
        String sep = File.separator;
        String filePath = "C:" + sep + "Users" + sep + "work" + sep + "Documents" + sep + "lessons" + sep + "lessons" + sep + "src" + sep + "Lesson37_Reading" + sep + "Test1";
        File file1 = new File(filePath);
        Scanner input = new Scanner(file1);
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        input.close();

        filePath = "C:" + sep + "Users" + sep + "work" + sep + "Documents" + sep + "lessons" + sep + "lessons" + sep + "src" + sep + "Lesson37_Reading" + sep + "Test2";
        File file2 = new File(filePath);
        input = new Scanner(file2);
        String line = input.nextLine();
        String[] numbersString = line.split(" ");
        for (int i = 0; i < numbersString.length; i++) {
            System.out.print(numbersString[i] + " ");
        }

        //или
        System.out.println(Arrays.toString(numbersString));

        //в обоих случа€х выводимые числа €вл€ютс€ не объектами типа int, а строками
        //дл€ преобразовани€ в int
        int[] numbersIntFirst = new int[3];
        int count = 0;
        for (String numberForEach : numbersString) {
            numbersIntFirst[count++] = Integer.parseInt(numberForEach);
        }
        System.out.print(Arrays.toString(numbersIntFirst));

        //или
        int[] numbersIntSecond = new int[3];
        for (int i = 0; i < numbersString.length; i++) {
            numbersIntSecond[i] = Integer.parseInt(numbersString[i]);
            System.out.print(numbersIntSecond[i] + " ");
        }
        input.close();
    }
}
