public class Lesson14_ClassesAndObjects {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.name = "First";
        personOne.age = 20;
        System.out.println("Меня зовут " + personOne.name + " и мне " + personOne.age + " лет");

        Person personTwo = new Person();
        personTwo.name = "Second";
        personTwo.age = 20;
        System.out.println("Меня зовут " + personTwo.name + " и мне " + personTwo.age + " лет");
    }
}

class Person {
    //У класса могут быть:
    //1. Данные (поля)
    //2. Действия, которые он может совершать (методы)

    String name;
    int age;
}
