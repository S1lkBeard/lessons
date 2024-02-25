package Lessons.Lesson46_48_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
//        Person person1 = new Person(1, "Александр");
//        Person person2 = new Person(2, "Юлия");
        Person[] people = {new Person(1, "Александр"), new Person(2, "Юлия"), new Person(3, "Тайга")};

        try {
            FileOutputStream fOS = new FileOutputStream("people.bin");
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);

//            oOS.writeObject(person1);
//            oOS.writeObject(person2);
            oOS.writeInt(people.length);
            for (Person person : people) {
                oOS.writeObject(person);
            }

            oOS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //или

        try {
            FileOutputStream fOS = new FileOutputStream("people2.bin");
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);

            oOS.writeObject(people);

            oOS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //или try with resources - в этом случае ObjectInputStream не нужно закрывать с помощью метода .close()

        try (ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream("people3.bin"))) {

            oOS.writeObject(people);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
