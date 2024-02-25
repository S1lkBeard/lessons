package Lessons.Lesson46_48_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fIS = new FileInputStream("people.bin");
            ObjectInputStream oIS = new ObjectInputStream(fIS);

//            Person person1 = (Person) oIS.readObject();
//            Person person2 = (Person) oIS.readObject();
            int personCount = oIS.readInt();
            Person[] people = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) oIS.readObject();
                System.out.println(people[i]);
            }
            //или
//            System.out.println(Arrays.toString(people));

//            System.out.println(person1);
//            System.out.println(person2);

            oIS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //или

        try {
            FileInputStream fIS = new FileInputStream("people2.bin");
            ObjectInputStream oIS = new ObjectInputStream(fIS);

            Person[] people = (Person[]) oIS.readObject();
            System.out.println(Arrays.toString(people));

            oIS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //или try with resources - в этом случае ObjectInputStream не нужно закрывать с помощью метода .close()

        try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream("people3.bin"))) {

            Person[] people = (Person[]) oIS.readObject();
            System.out.println(Arrays.toString(people));

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
