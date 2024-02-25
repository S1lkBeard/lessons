package Practice.Day05;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfRelease(1967);
        car.setColor("Deep blue");
        car.setModel("Ford Mustang");

        car.getModel();
        car.getYearOfRelease();
        car.getColor();
    }
}
