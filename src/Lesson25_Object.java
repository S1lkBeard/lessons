public class Lesson25_Object {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(string);

        Lesson25_Human human = new Lesson25_Human("First", 20);
        human.toString();
        System.out.println(human);         //эта строка = следующая строка
        System.out.println(human.toString());
    }
}

class Lesson25_Human {
    //все классы наследуются от класса Object - аналогом было бы писать ключевое слово extends после имени класса
    //class Lesson25_Human extends Object {
    private String name;
    private int age;

    public Lesson25_Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //если сигнатура метода созданного класса совпадает с сигнатурой метода родительского класса Object
    //то в этом случае метод созданного класса переопределяется
    public String toString() {
        return name + " " + age;
    }
}
