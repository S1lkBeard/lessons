public class Lesson19_This {
    public static void main(String[] args) {
        Human humanOne = new Human();
        humanOne.setName("HumanOne");
        humanOne.setAge(20);
        humanOne.getInfo();
    }
}

class Human {
    private String name;
    private int age;

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