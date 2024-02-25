package Practice.Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileRead = new File("shoes.csv");
        File fileWrite = new File("missing_shoes.txt");
        try {
            List<String> missingShoes = parseFileToStringList(fileRead);
            PrintWriter pW = new PrintWriter(fileWrite);
            for (String lines : missingShoes) {
                pW.println(lines);
            }
            pW.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        List<String> list = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] lines = line.split(";");
            if (Integer.parseInt(lines[2]) == 0) {
                list.add(line);
            }
        }
        input.close();
        return list;
    }
}