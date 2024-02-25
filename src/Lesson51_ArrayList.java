import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson51_ArrayList {
    public static void main(String[] args) {
        //согласно Java конвенции, желательно ссылаться на интерфейс List вместо ArrayList
        List<Integer> list = new ArrayList<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(9));

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer x : list) {
            System.out.println(x);
        }

        list.remove(5);
        System.out.println(list);

        //например, мы проводим много удалений из list
        list = new LinkedList<>();
    }
}

