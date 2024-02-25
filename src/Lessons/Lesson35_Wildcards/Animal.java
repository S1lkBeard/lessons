package Lessons.Lesson35_Wildcards;

public class Animal {
    private int id;
    //если есть класс, которые наследуется от родителя, и в родительском классе есть перегруженный конструктор
    //то для наследования в родительском классе должен присутствовать конструктор по умолчанию
    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public String toString() {
        return String.valueOf(id);
    }
}
