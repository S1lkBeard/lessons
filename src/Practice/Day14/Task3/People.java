package Practice.Day14.Task3;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "{name = " + this.name + ", year = " + this.age + "}";
    }
}
