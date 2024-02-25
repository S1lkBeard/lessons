package Practice.Day07;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Иркутский авиационный завод", 2017, 42, 87230);
        Airplane airplane2 = new Airplane("Смоленский авиационный завод", 2003, 9, 1350);

        airplane1.compareAirplanes(airplane1, airplane2);
        airplane2.compareAirplanes(airplane1, airplane2);
    }
}
