import java.util.Scanner;

/**
    Проверка четности числа
    Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
    чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
    Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

public class Task2 {

    public static void main(String[] args) {

        intNumber();

    }

    public static void intNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            System.out.println("Введенное число -> " + evenNumber(inputNumber));

        } else if (scanner.hasNextLine()) {
            System.out.println("Ошибка! Введите целое число!");
            intNumber();
        }

    }

    public static String evenNumber(int number) {
        return number % 2 == 0 ? "четное" : "нечетное";
    }

}
