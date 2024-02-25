import java.util.Scanner;

public class Lesson39_Exceptions {
    public static void main(String[] args) throws Lesson39_ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new Lesson39_ScannerException("Вы ввели значение, отличное от 0");
            }
        }
    }
}
