public class Lesson23_StringBuilder {
    public static void main(String[] args) {
        //объекты класса String являются unmutable - то есть не могут быть изменены
        String x = "hello";
        x.toUpperCase();
        System.out.println(x);
        x = x.toUpperCase();
        System.out.println(x);
        x = x + "friend";
        System.out.println(x);

        String one = "hello, ";
        String two = "my ";
        String three = "friend";
        //подобный метод объединения объектов ресурсоемок, т.к. после каждого плюса создается новый объект
        String allStrings = one + two + three;
        System.out.println(allStrings);

        //поэтому используется StringBuilder - с помощью него не нужно создавать новые объекта класса String
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());

        //метод chaining
        StringBuilder newSb = new StringBuilder("Hello");
        newSb.append(" my").append(" friend");
        System.out.println(newSb.toString());
    }
}
