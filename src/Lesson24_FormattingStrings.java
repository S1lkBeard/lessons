public class Lesson24_FormattingStrings {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hello again");

        System.out.print("Hello ");
        System.out.println("Hello again");

        //\n означает перенос строки
        //%s означает, что в это место должен подставить объект класса STRING
        System.out.printf("This is a string, %s \n", "NICE");
        //%d означает, что в это место должно подставиться число
        System.out.printf("This is a digit, %d \n", 10);
        //%f означает, что в это место должно подставиться дробное число
        System.out.printf("This is a floating, %f \n", 10.0);
        //значение после точки декларирует, сколько цифр после запятой будет отображено; дробное значение округляется
        System.out.printf("This is a floating, %.3f \n", 10.012999);
        //параметров может быть несколько; в таком случае количество параметров должно соответствовать количеству подставляемых значений в том же порядке
        System.out.printf("%s is a floating, %f \n", "THIS", 10.0);
        //число перед d означает минимальную ширину, которая будет выделена под отображение числа
        System.out.printf("This is a digit with space, %10d ??? \n", 1234);
        //знак "-" означает, что выводимое число будет выравнено по левому краю; выделенная ширина будет отображена справа
        System.out.printf("This is a digit with space, %-10d ??? \n", 1234);
    }
}
