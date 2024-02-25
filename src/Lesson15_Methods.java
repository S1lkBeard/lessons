public class Lesson15_Methods {
    public static void main(String[] args) {
        NewPerson personOne = new NewPerson();
        personOne.name = "First";
        personOne.age = 20;
        personOne.sayHello();
        personOne.speak();

        NewPerson personTwo = new NewPerson();
        personTwo.name = "Second";
        personTwo.age = 20;
        personTwo.sayHello();
        personTwo.speak();
    }
}

class NewPerson {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " и мне " + age + " лет");
        }

    }

    void sayHello() {
        System.out.println("'Привет!', - сказал " + name);
    }
}