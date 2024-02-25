package Practice.Day06;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike("Yamaha", "green", 2023);

        car.setYearOfRelease(1967);
        car.getInfo();
        car.yearDifference(2023);

        motorbike.getInfo();
        motorbike.yearDifference(2023);
    }
}
