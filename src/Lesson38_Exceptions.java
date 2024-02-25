import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson38_Exceptions {
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("dsa");
//        Scanner scanner = new Scanner(file);
//    }

    //или

    public static void main(String[] args) {
        File file = new File("dsa");
//        File file = new File("Test2");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После Scanner'a");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//            e.printStackTrace();
            System.out.println("Файл не найден");
        }

        System.out.println("После блока try-catch");

        //для вызова созданного метода, в котором указан throws, необходимо либо так же указать throws в классе main, либо вызов метода обернуть в try-catch
        try {
            readFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //при этом если в методе используется try-catch, то для вызова этого метода не требуются дополнительные конструкции
        readFile2();
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("dsa");
        Scanner scanner = new Scanner(file);
    }

    public static void readFile2() {
        File file = new File("dsa");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
