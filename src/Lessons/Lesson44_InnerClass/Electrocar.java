package Lessons.Lesson44_InnerClass;

public class Electrocar {
    private int id;

    //вложенный нестатический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Мотор запущен");
        }
    }

    //вложенный статический класс
    public static class Battery {
        public void charge() {
            System.out.println("Батарея электромобиля заряжается");
        }
    }

    public Electrocar (int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        //третий тип вложенных классов - класс, вложенный в метод
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Электромобиль " + id + " запущен");
    }

    private void test(Object obj) {

    }
}
