import java.util.ArrayList;
import java.util.List;

public class Lesson34_Generics {
    public static void main(String[] args) {
        List animals = new ArrayList();
        Lesson34_Animal classAnimal = new Lesson34_Animal();
        animals.add("�����");
        animals.add("������");
        animals.add("�������");
        animals.add(classAnimal);
        //�������� �� ��, ��� � animals ���� ��������� ������, ��� ������ �������� � ���� �������� ������ Objects
        //String animal = animals.get(1);
        //������� ���������� ��������������� Downcast
        String animal = (String) animals.get(1);
        System.out.println(animal);
        //� ��������� ������ ������ ��������� Downcast - ������ java.lang.ClassCastException
        //String ourAnimal = (String) animals.get(3);
        //�� ������ ������ �� ����� ������, ������� ������� � Java 5 ���� ������� Generics, ��� �� ��������������
        List<String> animalsNew = new ArrayList<String>();
        animalsNew.add("�����");
        animalsNew.add("������");
        animalsNew.add("�������");
        //������ ������ �������� � ��������� ������ ������� ������, ��������� �� ����������������
        //animalsNew.add(classAnimal);
        String animalNew = animalsNew.get(1);
        System.out.println(animalNew);
        //������� � Java 7, ��������� ��� ���������� ���� ���� ���
        List<String> animalsNew1 = new ArrayList<>();
    }
}

class Lesson34_Animal {

}
