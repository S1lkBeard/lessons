public class Lesson26_Dog extends Lesson26_Animal {
    public void bark() {
        System.out.println("Собака лает");
    }

    //аннотацию @Override можно писать, можно не писать
    //@Override
    public void eat() {
        System.out.println("Собака ест");
    }

    public void showName() {
        System.out.println("Имя собаки - " + name);
    }
}
