package Lessons.Lesson30_Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();

        Animal animalDog = new Dog();
        animalDog.eat();
//        animalDog.bark();

        Animal animal2 = new Animal();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog2);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
