import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson38_Exceptions {
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("dsa");
//        Scanner scanner = new Scanner(file);
//    }

    //���

    public static void main(String[] args) {
        File file = new File("dsa");
//        File file = new File("Test2");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("����� Scanner'a");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//            e.printStackTrace();
            System.out.println("���� �� ������");
        }

        System.out.println("����� ����� try-catch");

        //��� ������ ���������� ������, � ������� ������ throws, ���������� ���� ��� �� ������� throws � ������ main, ���� ����� ������ �������� � try-catch
        try {
            readFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //��� ���� ���� � ������ ������������ try-catch, �� ��� ������ ����� ������ �� ��������� �������������� �����������
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
