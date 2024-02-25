package Practice.Day07;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weigth;
    private int fuel;

    public Airplane(String producer, int year, int length, int weigth) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigth = weigth;
        this.fuel = 0;
    }

    public void compareAirplanes (Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) {
            System.out.println("Самолет производства " + airplane1.producer + " длиннее, чем самолет производства " + airplane2.producer);
        } else {
            System.out.println("Самолет производства " + airplane2.producer + " длиннее, чем самолет производства " + airplane1.producer);
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLenght(int length) {
        this.length = length;
    }

    public void fillUp(int volumesOfFuel) {
        this.fuel = this.fuel + volumesOfFuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weigth + ", количество топлива в баке: " + fuel);
    }
}