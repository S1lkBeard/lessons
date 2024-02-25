public class Lesson26_Animal {

    protected String name;
    //private String name; //private переменные не наследуются, и потомки не имеют к ним доступа

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}
