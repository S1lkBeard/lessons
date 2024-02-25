package Lessons.Lesson27_Interfaces;

public class Lesson27_Test {
    public static void main(String[] args) {
        Lesson27_Animal animal = new Lesson27_Animal(1);

        Lesson27_Person person = new Lesson27_Person("Александр");

        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();

        //то, что идёт ниже относится к полиморфизму
        //так можно делать только в случае, если класс и интерфейс связаны
        Lesson27_Info info1 = new Lesson27_Animal(2);
        Lesson27_Info info2 = new Lesson27_Person("Завлор");

        //у объектов интерфейсов можно вызвать только те методы, которые есть в интерфейсе
        //и, соответственно, в имплентированных классах
        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);
        //в метод outputInfo можно подать не только объект интерфейса Lesson27_Info
        //но и объекты имплентированных классов
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Lesson27_Info info) {
        info.showInfo();
    }
}
