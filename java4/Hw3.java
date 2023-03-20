import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        char operator = ' ';
        int num = 0;
        boolean canUndo = false;

        while (true) {
            System.out.println("Введите число, оператор или 'Отмена': ");
            String input = scanner.next();
            if (input.equals("Отмена")) {
                if (!canUndo) {
                    System.out.println("Ошибка: нет операций для отмены.");
                    continue;
                }
                int lastNum = stack.pop();
                if (!stack.empty()) {
                    operator = (char)stack.pop().intValue();
                    canUndo = true;
                } else {
                    canUndo = false;
                }
                num = stack.peek();
                System.out.println("Результат = " + num);
            } else if (isOperator(input.charAt(0))) {
                operator = input.charAt(0);
                System.out.println("Оператор '" + operator + "' записан. Введите число");
            } else {
                int newNum = Integer.parseInt(input);
                if (operator != ' ') {
                    int result = performOperation(operator, num, newNum);
                    stack.push((int)operator);
                    
                    num = result;
                    stack.push(num);
                    operator = ' ';
                    canUndo = true;
                    System.out.println("Результат = " + num);
                } else {
                    num = newNum;
                    stack.push(num);
                }
            }
        }
    }

    private static boolean isOperator(char c) {
        return c == '+' ||  c == '-' || c == '*' || c == '/';
    }

    private static int performOperation(char operator, int num1, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }
}