package Practice.Day09.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("�������� �.�.", "��-10-3");
        Teacher teacher = new Teacher("���������� �.�.", "������������");

        student.getGroupName();
        teacher.getTeachersSubject();
        student.printInfo();
        teacher.printInfo();
    }
}
