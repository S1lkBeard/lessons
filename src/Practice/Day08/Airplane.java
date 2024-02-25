package Practice.Day08;

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
        System.out.println("»зготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weigth + ", количество топлива в баке: " + fuel);
    }

    public String toString() {
        return "ѕроизводитель - " + producer + ", год выпуска - " + year + ", длина самолета, м - " + length + ", масса самолета, кг - " + weigth + ", количество топлива в баках, л - " + fuel;
    }
}