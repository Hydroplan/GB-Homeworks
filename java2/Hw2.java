import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("[,:]+"); // разбиваем строку на части
                String name = parts[1];
                String mark = parts[3];
                String subject = parts[5];

                // формируем новую строку с помощью StringBuilder
                StringBuilder sb = new StringBuilder();
                sb.append("Студент ");
                sb.append(name);
                sb.append(" получил ");
                sb.append(mark);
                sb.append(" по предмету ");
                sb.append(subject);
                sb.append(".");
                System.out.println(sb.toString());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}