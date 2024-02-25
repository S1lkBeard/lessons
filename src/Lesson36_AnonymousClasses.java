public class Lesson36_AnonymousClasses {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        OtherAnimals otherAnimal = new OtherAnimals();
        otherAnimal.eat();

        //приведенная ниже реализация называется "Анонимные классы" - можно использовать, когда нужно переопределить метод класса
        //но при этом не хочется создавать отдельный наследуемый класс
        Animal animal2 = new Animal() {
            //с помощью такой конструкции создается анонимный класс (анонимный наследник), которые наследуется от родителя
            public void eat() {
                System.out.println("Животное из анонимного класса ест");
            }
        };
        animal2.eat();

        //аналогично можно сделать и для интерфейса
        AnimalsInterface animalsFromInterface = new AnimalsInterface() {
            public void eat() {
                System.out.println("Животное из интерфейса ест");
            }
        };
        animalsFromInterface.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("Животное ест");
    }
}

class OtherAnimals extends Animal {
    public void eat() {
        System.out.println("Другое животное ест");
    }
}

interface AnimalsInterface {
    public void eat();
}