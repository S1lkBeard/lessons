package Lessons.Lesson46_48_Serialization;

import java.io.Serial;
import java.io.Serializable;
//для того, чтобы созданные объекты классов можно было записывать в файлы, необходимо имплементировать интерфейс Serializable
public class Person implements Serializable {
    //если указать transient у примитивного типа, то в файл будет записан 0 вместо указанного значения
    private int id;
    //у ссылочного типа в этом случае будет null
    private String name;
//    private transient String name;

    //serialVersionUID используется для придания версионности;
    //например, ранее был создан объект класса Person, и записан в файл.
    //cпустя время класс был модифицирован, и при попытке открыть созданный ранее файл, будет получена ошибка
    //используется в Java по умолчанию, дополнительно декларировать не нужно
//    @Serial
//    private static final long serialVersionUID = -3432423423543245345L;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
