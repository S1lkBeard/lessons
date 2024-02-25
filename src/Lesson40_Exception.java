import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson40_Exception {
    public static void main(String[] args) {
        //Checked exception, или Compile time exception - исключени€, возникающие во врем€ компил€ции; без этих исключений код не скомпилируетс€ = исключительные случаи в работе программы
        //Class Exception (см. документацию) - все они €вл€ютс€ checked, кроме RuntimeException
        File file = new File("dsa");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("ѕосле Scanner'a");
        } catch (FileNotFoundException e) {
            System.out.println("‘айл не найден");
        }

        //Unchecked exception, или Runtime time exception  - исключени€, возникающие во врем€ выполнени€ программы
        //обработка не требуетс€, т.к. они €вл€ютс€ ошибкой в работе программы, и они должны быть предотвращены, а не обработаны
//        int a = 1 / 0;  //1
//        String name = null;  //2
//        name.length();  //2
//        int[] array = new int[2];  //3
//        System.out.println(array[2]);  //3
    }
}
