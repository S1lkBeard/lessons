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
        //в случае листов полиморфизм применен быть не может
        //test(listOfDogs);
        testWildcard(listOfDogs);
    }

    private static void test(List<Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }
    }

    //использование listOfDogs в качестве аргумента не вызывает ошибки при вызове метода
    //но в самом методе появилась ошибка
    //private static void testWildcard(List<?> list) {
    //в типе передаваемого аргумента необходимо указать extends и класс
    private static void testWildcard(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }

    //ключевое слово super означает, что в качестве передаваемых типов могут быть только те, которые по иерархии выше класса Animal
    //в этом случае иерархией является - Object - Animal - Dog
    private static void testForSuper(List<? super Animal> list) {
        for (Object object : list) {
            object.toString();
        }
    }
}
