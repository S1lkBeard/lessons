package Practice.Day09.Task1;

public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        System.out.println("Название группы студента - " + groupName);
        return groupName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }
}
