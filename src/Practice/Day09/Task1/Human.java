package Practice.Day09.Task1;

public class Human {
//    private String name;
    //переменная name задекларирована как protected для того, чтобы классы-наследники могли обращаться к этой переменной
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Имя человека - " + name);
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }
}
