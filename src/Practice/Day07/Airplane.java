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
            System.out.println("������� ������������ " + airplane1.producer + " �������, ��� ������� ������������ " + airplane2.producer);
        } else {
            System.out.println("������� ������������ " + airplane2.producer + " �������, ��� ������� ������������ " + airplane1.producer);
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
        System.out.println("������������: " + producer + ", ��� �������: " + year + ", �����: " + length + ", ���: " + weigth + ", ���������� ������� � ����: " + fuel);
    }
}