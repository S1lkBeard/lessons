package Practice.Day06;

public class Car {
    private int yearOfRelease;
    private String color;
    private String model;

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int yearDifference(int yearDifference) {
        System.out.println(Math.abs(this.yearOfRelease - yearDifference));
        return (Math.abs(this.yearOfRelease - yearDifference));
    }

    public void getInfo() {
        System.out.println("��� ������");
    }

    public int getYearOfRelease() {
        System.out.println("��� ������� ������ - " + yearOfRelease);
        return yearOfRelease;
    }

    public String getColor() {
        System.out.println("���� ������ - " + color);
        return color;
    }

    public String getModel() {
        System.out.println("������ ������ - " + model);
        return model;
    }
}
