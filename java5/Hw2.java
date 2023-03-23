import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] employees = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };

        Map<String, Integer> nameCountMap = new HashMap<>();
        for (String employee : employees) {
            String[] nameParts = employee.split(" ");
            String firstName = nameParts[0];
            nameCountMap.put(firstName, nameCountMap.getOrDefault(firstName, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCountMap.entrySet());
        sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}