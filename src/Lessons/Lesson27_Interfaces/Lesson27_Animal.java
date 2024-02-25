package Lessons.Lesson27_Interfaces;

//класс можно реализовать любое количество интерфейсов; в таком случае интерфейсы перечисляются через запятую
//но наследоваться можно только от одного класса
public class Lesson27_Animal implements Lesson27_Info {
    public int id;

    public Lesson27_Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Животное спит");
    }

    public void showInfo() {
        System.out.println("Информация. Номер животного: " + id);
    }
}
