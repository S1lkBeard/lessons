package Practice.Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> listOfCars = new ArrayList<>();
        listOfCars.add(new String("Opel1"));
        listOfCars.add(new String("Opel2"));
        listOfCars.add(new String("Opel3"));
        listOfCars.add(new String("Opel4"));
        listOfCars.add(new String("Opel5"));
        System.out.println(listOfCars);
        listOfCars.add(listOfCars.size()/2, new String("OpelNew"));
        System.out.println(listOfCars);

        listOfCars.remove(0);
        System.out.println(listOfCars);
    }
}
