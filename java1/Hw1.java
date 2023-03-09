import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Вычисляем n-ое треугольное число
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        System.out.println("Треугольное число 1 + 2 + ... + " + n + " = " + triangleNumber);

        // Вычисляем n!
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n! = " + factorial);
    }
}