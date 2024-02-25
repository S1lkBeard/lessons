import java.util.ArrayList;
import java.util.List;

public class Lesson34_Generics {
    public static void main(String[] args) {
        List animals = new ArrayList();
        Lesson34_Animal classAnimal = new Lesson34_Animal();
        animals.add("Кошка");
        animals.add("Собака");
        animals.add("Лягушка");
        animals.add(classAnimal);
        //несмотря на то, что в animals были добавлены строки, эти строка хранятся в виде объектов класса Objects
        //String animal = animals.get(1);
        //поэтому необходимо воспользоваться Downcast
        String animal = (String) animals.get(1);
        System.out.println(animal);
        //к следующей строке нельзя применить Downcast - ошибка java.lang.ClassCastException
        //String ourAnimal = (String) animals.get(3);
        //но данный способ не очень удобен, поэтому начиная с Java 5 были созданы Generics, она же параметризация
        List<String> animalsNew = new ArrayList<String>();
        animalsNew.add("Кошка");
        animalsNew.add("Собака");
        animalsNew.add("Лягушка");
        //Теперь нельзя добавить в созданный объект объекта класса, отличного от декларированного
        //animalsNew.add(classAnimal);
        String animalNew = animalsNew.get(1);
        System.out.println(animalNew);
        //начиная с Java 7, указывать тип необходимо лишь один раз
        List<String> animalsNew1 = new ArrayList<>();
    }
}

class Lesson34_Animal {

}
