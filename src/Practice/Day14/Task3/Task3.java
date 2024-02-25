package Practice.Day14.Task3;

import Practice.Day14.Task1.WrongInputFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("Practice.Day14.Task2.people.txt");
        List<People> fileList = new ArrayList<>();
        try {
            fileList = parseFileToStringList(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (WrongInputFile e) {
            System.out.println("Некорректный входной файл");
        }
        for (People newList : fileList) {
            System.out.print(newList + " ");
        }
    }

    public static List<People> parseFileToStringList(File file) throws FileNotFoundException, WrongInputFile {
        Scanner input = new Scanner(file);
        List<People> listOfPeople = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] lines = line.split(" ");
            if (Integer.parseInt(lines[1]) < 0) {
                throw new WrongInputFile();
            }
            People people = new People(lines[0], Integer.parseInt(lines[1]));
            listOfPeople.add(people);
        }
        input.close();
        return listOfPeople;
    }
}