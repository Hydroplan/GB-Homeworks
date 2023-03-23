import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите 1, чтобы добавить номер телефона, или 2, чтобы вывести все номера:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // считываем оставшийся символ перевода строки
            switch (choice) {
                case 1:
                    System.out.println("Введите фамилию:");
                    String lastName = scanner.nextLine();
                    System.out.println("Введите номер телефона:");
                    String phoneNumber = scanner.nextLine();
                    if (phoneBook.containsKey(lastName)) {
                        // Если фамилия уже есть в телефонной книге, добавляем номер в список
                        phoneBook.get(lastName).add(phoneNumber);
                    } else {
                        // Иначе, создаем новую запись в телефонной книге
                        ArrayList<String> phoneNumbers = new ArrayList<>();
                        phoneNumbers.add(phoneNumber);
                        phoneBook.put(lastName, phoneNumbers);
                    }
                    break;
                case 2:
                    for (String lastNameKey : phoneBook.keySet()) {
                        System.out.print(lastNameKey + ": ");
                        ArrayList<String> phoneNumbers = phoneBook.get(lastNameKey);
                        for (String phoneNumberValue : phoneNumbers) {
                            System.out.print(phoneNumberValue + ", ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        }
    }
}