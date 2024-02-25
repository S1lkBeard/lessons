package Practice.Day09.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.printf("Сумма периметров красных фигур = %.2f \n", calculateRedPerimeter(figures));
        System.out.printf("Сумма площадей красных фигур = %.2f \n", calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumOfRedPerimeters = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor() == "Red") {
                sumOfRedPerimeters = sumOfRedPerimeters + figures[i].perimeter();
            }
        }
        return sumOfRedPerimeters;
    };

    public static double calculateRedArea(Figure[] figures) {
        double sumOfRedAreas = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor() == "Red") {
                sumOfRedAreas = sumOfRedAreas + figures[i].area();
            }
        }
        return sumOfRedAreas;
    };
}
