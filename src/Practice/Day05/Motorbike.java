package Practice.Day05;

public class Motorbike {
    private int yearOfRelease;
    private String color;
    private String model;

    public Motorbike(String model, String color, int yearOfRelease) {
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }

    public int getYearOfRelease() {
        System.out.println("��� ������� ��������� - " + yearOfRelease);
        return yearOfRelease;
    }

    public String getColor() {
        System.out.println("���� ��������� - " + color);
        return color;
    }

    public String getModel() {
        System.out.println("������ ��������� - " + model);
        return model;
    }
}
