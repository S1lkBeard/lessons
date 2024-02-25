package Lessons.Lesson46_48_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
//        Person person1 = new Person(1, "���������");
//        Person person2 = new Person(2, "����");
        Person[] people = {new Person(1, "���������"), new Person(2, "����"), new Person(3, "�����")};

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

        //���

        try {
            FileOutputStream fOS = new FileOutputStream("people2.bin");
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);

            oOS.writeObject(people);

            oOS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //��� try with resources - � ���� ������ ObjectInputStream �� ����� ��������� � ������� ������ .close()

        try (ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream("people3.bin"))) {

            oOS.writeObject(people);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
