public class Lesson20_Constructor {
    public static void main(String[] args) {
        Lesson20_Human humanOne = new Lesson20_Human();
        humanOne.getInfo();

        Lesson20_Human humanTwo = new Lesson20_Human("HumanTwo");
        humanTwo.getInfo();

        Lesson20_Human humanThird = new Lesson20_Human("HumanTwo", 20);
        humanThird.getInfo();
    }
}

class Lesson20_Human {

    private String name;
    private int age;

    //¬ Java можно иметь методы с одинаковыми именами, если они принимают разные параметры
    //Ёто называетс€ "ѕерегрузкой метода"
    public Lesson20_Human() {
        System.out.println("ѕривет из первого конструктора");
        this.name = "»м€ по умолчанию";
        this.age = 0;
    }

    public Lesson20_Human(String name) {
        System.out.println("ѕривет из второго конструктора");
        this.name = name;
    }

    public Lesson20_Human(String name, int age) {
        System.out.println("ѕривет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name; //this используетс€, чтобы Java могла отличить переменную, пришедшую в метод, от переменной, объ€вленной в классе
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("»м€ человека - " + name + ", его возраст - " + age);
    }
}