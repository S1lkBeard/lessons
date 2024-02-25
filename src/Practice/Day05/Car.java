package Practice.Day05;

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

    public int getYearOfRelease() {
        System.out.println("Год выпуска машины - " + yearOfRelease);
        return yearOfRelease;
    }

    public String getColor() {
        System.out.println("Цвет машины - " + color);
        return color;
    }

    public String getModel() {
        System.out.println("Модель машины - " + model);
        return model;
    }
}
