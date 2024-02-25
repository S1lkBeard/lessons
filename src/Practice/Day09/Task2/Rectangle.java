package Practice.Day09.Task2;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return (height + width) * 2;
    }
}
