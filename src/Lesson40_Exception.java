import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson40_Exception {
    public static void main(String[] args) {
        //Checked exception, ��� Compile time exception - ����������, ����������� �� ����� ����������; ��� ���� ���������� ��� �� �������������� = �������������� ������ � ������ ���������
        //Class Exception (��. ������������) - ��� ��� �������� checked, ����� RuntimeException
        File file = new File("dsa");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("����� Scanner'a");
        } catch (FileNotFoundException e) {
            System.out.println("���� �� ������");
        }

        //Unchecked exception, ��� Runtime time exception  - ����������, ����������� �� ����� ���������� ���������
        //��������� �� ���������, �.�. ��� �������� ������� � ������ ���������, � ��� ������ ���� �������������, � �� ����������
//        int a = 1 / 0;  //1
//        String name = null;  //2
//        name.length();  //2
//        int[] array = new int[2];  //3
//        System.out.println(array[2]);  //3
    }
}
