import java.io.IOException;
import java.text.ParseException;

public class Lesson41_Exception {
    public static void main(String[] args) {
        try {
            run();
            //multicatch
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
            //или - можно использовать единый Exception; это также является примером полиморфизма
        } catch (Exception e) {
            throw new RuntimeException();
        }
        //или использовать отдельные catch
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
