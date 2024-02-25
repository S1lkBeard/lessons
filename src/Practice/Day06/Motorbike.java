package Practice.Day06;

public class Motorbike {
    private int yearOfRelease;
    private String color;
    private String model;

    public Motorbike(String model, String color, int yearOfRelease) {
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }

    public int yearDifference(int yearDifference) {
        System.out.println(Math.abs(this.yearOfRelease - yearDifference));
        return (Math.abs(this.yearOfRelease - yearDifference));
    }

    public void getInfo() {
        System.out.println("Это мотоцикл");
    }

    public int getYearOfRelease() {
        System.out.println("Год выпуска мотоцикла - " + yearOfRelease);
        return yearOfRelease;
    }

    public String getColor() {
        System.out.println("Цвет мотоцикла - " + color);
        return color;
    }

    public String getModel() {
        System.out.println("Модель мотоцикла - " + model);
        return model;
    }
}
