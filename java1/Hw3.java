import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Введите знак (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: неправильный знак");
                return;
        }
        
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
