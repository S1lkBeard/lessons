package Lessons.Lesson33_UpcastingDowncasting;

public class Test {
    public static void main(String[] args) {

        //Upcasting - восходящее преобразование (от наследника к родителю), т.к. в иерархии наследования класс Dog ниже, чем Animal
        Animal animal = new Dog();
        //или
        Dog dog1 = new Dog();
        Animal animal1 = dog1;
        //Upcasting происходят неявно, т.е. без нашего участия

        //Downcasting - нисходящее преобразование (от наследника к родителю), т.к. в иерархии наследования класс Dog ниже, чем Animal
        Dog dog2 = (Dog) animal1; //явное преобразование
        dog2.bark();

        Animal a = new Animal();
        Dog b = (Dog) a;
        b.bark();
    }
}
