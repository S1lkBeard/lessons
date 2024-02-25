public class Lesson26_Inheritance {
    public static void main(String[] args) {
        Lesson26_Animal animal = new Lesson26_Animal();

        animal.eat();
        animal.sleep();

        Lesson26_Dog dog = new Lesson26_Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
    }
}
