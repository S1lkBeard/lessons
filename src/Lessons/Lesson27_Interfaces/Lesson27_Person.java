package Lessons.Lesson27_Interfaces;

//класс можно реализовать любое количество интерфейсов; в таком случае интерфейсы перечисляются через запятую
//но наследоваться можно только от одного класса
public class Lesson27_Person implements Lesson27_Info {
    public String name;

    public Lesson27_Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Привет!");
    }

    public void showInfo() {
        System.out.println("Информация. Имя человека: " + name);
    }
}
