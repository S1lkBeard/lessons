package Practice.Day06;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Иркутский авиационный завод", 2017, 42, 87230);

        airplane.info();
        airplane.setYear(2019);
        airplane.setLenght(47);
        airplane.fillUp(16000);
        airplane.info();
        airplane.fillUp(1600);
        airplane.info();
    }
}
