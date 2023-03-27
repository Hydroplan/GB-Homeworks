import java.util.*;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Lenovo", 8, 512, "Windows", "Silver");
        NoteBook notebook2 = new NoteBook("Dell", 16, 512, "Windows", "Black");
        NoteBook notebook3 = new NoteBook("MacBook Pro", 16, 512, "MacOS", "Space Gray");
        NoteBook notebook4 = new NoteBook("HP", 8, 256, "Windows", "White");
        NoteBook notebook5 = new NoteBook("Acer", 16, 1000, "Windows", "Black");

        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

        Map<String, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int minRam = scanner.nextInt();
                filters.put("ram", minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объем жесткого диска:");
                int minStorage = scanner.nextInt();
                filters.put("storage", minStorage);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filters.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filters.put("color", color);
                break;
            default:
                System.out.println("Ошибка: некорректный выбор критерия");
        return;
    }
    
 Set<NoteBook> filteredNotebooks = filterNotebooks(notebooks, filters);

    if (filteredNotebooks.isEmpty()) {
        System.out.println("Ноутбуки, удовлетворяющие критериям, не найдены.");
    } else {
        System.out.println("Найдены следующие ноутбуки:");
        for (NoteBook notebook : filteredNotebooks) {
            System.out.println(notebook.getModel() + " " + notebook.getRam() + "GB RAM " + notebook.getStorage() + "GB storage " + notebook.getOs() + " " + notebook.getColor());
        }
    }
}

public static Set<NoteBook> filterNotebooks(Set<NoteBook> notebooks, Map<String, Object> filters) {
    Set<NoteBook> filteredNotebooks = new HashSet<>();

    for (NoteBook notebook : notebooks) {
        if (filters.containsKey("ram") && notebook.getRam() < (int) filters.get("ram")) {
            continue;
        }
        if (filters.containsKey("storage") && notebook.getStorage() < (int) filters.get("storage")) {
            continue;
        }
        if (filters.containsKey("os") && !notebook.getOs().equalsIgnoreCase((String) filters.get("os"))) {
            continue;
        }
        if (filters.containsKey("color") && !notebook.getColor().equalsIgnoreCase((String) filters.get("color"))) {
            continue;
        }
        filteredNotebooks.add(notebook);
    }

    return filteredNotebooks;
}
public static class NoteBook {
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public NoteBook(String model, int ram, int storage, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
}
}
