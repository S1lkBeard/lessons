package Lessons.Lesson44_InnerClass;

public class Electrocar {
    private int id;

    //��������� ������������� �����
    private class Motor {
        public void startMotor() {
            System.out.println("����� �������");
        }
    }

    //��������� ����������� �����
    public static class Battery {
        public void charge() {
            System.out.println("������� ������������� ����������");
        }
    }

    public Electrocar (int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        //������ ��� ��������� ������� - �����, ��������� � �����
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("������������� " + id + " �������");
    }

    private void test(Object obj) {

    }
}
