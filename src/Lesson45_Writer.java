import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lesson45_Writer {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFileFile");
        PrintWriter pW = new PrintWriter(file);

        pW.println("Тест");
        pW.println("Test");

        pW.close();
    }
}
