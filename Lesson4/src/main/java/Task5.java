import java.util.Scanner;

//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
public class Task5 {
    public static void main(String[] args) {
        intNumber();

    }

    public static void intNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            System.out.println(inputNumber + " - это " + evenNumber(inputNumber) + " число, " +
                    "количество цифр = " + countDigits(inputNumber));

        } else if (scanner.hasNextLine()) {
            System.out.println("Ошибка! Введите целое число!");
            intNumber();
        }
    }

    public static String evenNumber(int number) {
        return number > 0 ? "положительное" : "отрицательное";
    }

    public static int countDigits(int number) {
        int count = 0;
        if (number != 0) {
            while (number != 0) {
                number /= 10;
                count++;
            }
        } else count = 1;

        return count;

    }
}
