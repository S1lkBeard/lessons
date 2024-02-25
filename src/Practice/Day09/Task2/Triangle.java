package Practice.Day09.Task2;

public class Triangle extends Figure {
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(double lengthA, double lengthB, double lengthC, String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double halfPeri = (lengthA + lengthB + lengthC) / 2;
        //по формуле Герона
        return Math.sqrt(halfPeri * (halfPeri - lengthA) * (halfPeri - lengthB) * (halfPeri - lengthC));
    }

    @Override
    public double perimeter() {
        return (lengthA + lengthB + lengthC);
    }
}
