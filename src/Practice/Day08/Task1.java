package Practice.Day08;

import java.time.Duration;
import java.time.Instant;

public class Task1 {
    public static void main(String[] args) {
        String fullString = "";
        Instant start = Instant.now();
        for (int i = 0; i <= 20000; i++) {
            fullString = fullString + String.valueOf(i) + " ";
        }
        System.out.println(fullString);
        Instant finish = Instant.now();
        long elapsedForString = Duration.between(start, finish).toMillis();

        start = Instant.now();
        StringBuilder fullStringSB = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            fullStringSB.append(String.valueOf(i) + " ");
        }
        System.out.println(fullStringSB);
        finish = Instant.now();
        long elapsedForStringBuilder = Duration.between(start, finish).toMillis();

        System.out.println("Время исполнения для String, мс: " + elapsedForString);
        System.out.println("Время исполнения для StringBuilder, мс: " + elapsedForStringBuilder);
    }
}
