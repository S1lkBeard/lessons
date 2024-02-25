public class Lesson21_Static {
    public static void main(String[] args) {
        Lesson21_Human h1 = new Lesson21_Human("First", 20);
        Lesson21_Human.printNumberOfPeople();
        Lesson21_Human h2 = new Lesson21_Human("Third", 20);
        Lesson21_Human.printNumberOfPeople();

        //к static переменным корректнее обращаться через класс, к которому они принадлежат
        Lesson21_Human.description = "Человек";
        Lesson21_Human.getDescription();

        //а не через объекты этого класса
        h1.description = "fdsf";
        h2.description = "qqqq";
        h1.getInfo();
        h2.getInfo();

        Lesson21_Human.getDescription();

        System.out.println(Math.pow(2, 4));
    }
}

class Lesson21_Human {

    //к этим переменным класса можно обращаться, только создав объект данного класса
    //в этом случае - объект под именем h1 (см. выше)
    private String name;
    private int age;

    //к этой переменной класса можно обратиться через класс, которому принадлежит эта переменная (см. выше)
    //и можно так же через созданный объект класса
    //static означает, что переменная принадлежит не объектам класса, а самому классу
    //static переменная общая для всего класса, и существует в одном экземпляре
    //это означает, что у объектов (h1, h2, etc.) класса Lesson21_Human не может быть разных description
    public static String description;

    private static int countPeople;

    public Lesson21_Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name; //this используется, чтобы Java могла отличить переменную, пришедшую в метод, от переменной, объявленной в классе
    }


    public void getInfo() {
        System.out.println("Имя человека - " + name + ", его возраст - " + age + " " + description);
    }

    //в static методе нельзя обращаться к не-static переменным - в таком случае отображается ошибка
        public static void getInfoStatic() {
    //        System.out.println("Имя человека - " + name + ", его возраст - " + age + " " + description);
        }

    public static void getDescription() {
        System.out.println(description);
    }

    public static void printNumberOfPeople() {
        System.out.println("Количество людей = " + countPeople);
    }
}