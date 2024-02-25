package Lessons.Lesson49_Enum;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation());
        System.out.println(animal.toString());
        switch (animal) {
            case CAT:
                System.out.println("Это кошка");
                break;
            case DOG:
                System.out.println("Это собака");
                break;
        }

        //Object - Enum - Season

        Season season = Season.SPRING;
        System.out.println("Средняя температура в градусах Цельсия в сезон " + "'" + season.getTranslation() +  "'" + " равна " + season.getAvgTemp());
        //instanceof проверяет, является ли объект объектом указанного класса
        System.out.println(season instanceof Season);
        System.out.println(season instanceof Enum);
        System.out.println(season instanceof Object);

        System.out.println(season.name());
        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1.getTranslation());
        System.out.println(season1.ordinal());

        switch (season) {
            case SPRING:
                System.out.println("Это весна");
                break;
        }
    }
}
