package Lessons.Lesson35_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        test(listOfAnimals);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        //� ������ ������ ����������� �������� ���� �� �����
        //test(listOfDogs);
        testWildcard(listOfDogs);
    }

    private static void test(List<Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }
    }

    //������������� listOfDogs � �������� ��������� �� �������� ������ ��� ������ ������
    //�� � ����� ������ ��������� ������
    //private static void testWildcard(List<?> list) {
    //� ���� ������������� ��������� ���������� ������� extends � �����
    private static void testWildcard(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }

    //�������� ����� super ��������, ��� � �������� ������������ ����� ����� ���� ������ ��, ������� �� �������� ���� ������ Animal
    //� ���� ������ ��������� �������� - Object - Animal - Dog
    private static void testForSuper(List<? super Animal> list) {
        for (Object object : list) {
            object.toString();
        }
    }
}
