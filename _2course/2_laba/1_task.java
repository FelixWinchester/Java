import java.util.Scanner;

class Calculator {

    // Метод для сложения
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Ошибка: Деление на ноль невозможно.");
        }
        return a / b;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект для ввода с консоли
        Calculator calculator = new Calculator(); // Создаем объект класса Calculator
        String input; // Строка для считывания данных с консоли

        while (true) {
            System.out.println("Введите первое число (или 'exit' для выхода): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            try {

                double num1 = Double.parseDouble(input);

                System.out.println("Введите оператор (+, -, *, /): ");
                String operator = scanner.nextLine();

                System.out.println("Введите второе число: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result;

                switch (operator) {
                    case "+":
                        result = calculator.add(num1, num2);
                        System.out.println("Результат: " + result);
                        break;
                    case "-":
                        result = calculator.subtract(num1, num2);
                        System.out.println("Результат: " + result);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        System.out.println("Результат: " + result);
                        break;
                    case "/":
                        try {
                            result = calculator.divide(num1, num2);
                            System.out.println("Результат: " + result);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Ошибка: Некорректный оператор.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное число.");
            }
        }
        scanner.close();
    }
}

