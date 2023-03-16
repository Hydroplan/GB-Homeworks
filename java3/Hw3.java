import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(4);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        numbers.add(9);
        numbers.add(6);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);
    }
}