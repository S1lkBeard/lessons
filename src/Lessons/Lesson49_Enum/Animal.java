package Lessons.Lesson49_Enum;

public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");

    private String translation;

    //в enum необязательно указывать модификатор доступа - Java по умолчанию выбирает private
    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык: " + translation;
    }
}
