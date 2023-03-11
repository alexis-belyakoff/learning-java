import java.util.Scanner;

/**
 * Меньшее по модулю число
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
 * пользователем вещественных чисел с консоли.
 */

public class Task3 {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("Меньшее по модулю из " + numbers.length + " введённых чисел: "
                            + smallerValue(inputNums(numbers))
                            );



    }

    public static int smallerValue(int[] fullNums) {
        int smallerNum = Math.abs(fullNums[0]);
        for (int fullNum : fullNums) {

            if (smallerNum > Math.abs(fullNum)) {
                smallerNum = Math.abs(fullNum);
            }

        }

        return smallerNum;
    }

    public static int[] inputNums(int[] num) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < num.length; i++) {

            System.out.print("Введите число " + (i + 1) + ": ");

            if (scanner.hasNextInt()) {
                num[i] = scanner.nextInt();
                count++;
            } else if (scanner.hasNextLine()) {
                System.out.println("Ошибка! Введите целое число!");
                return continuingInputNumbers(num, count);
            }

        }

        return num;
    }

    public static int[] continuingInputNumbers(int[] array, int pos) {
        Scanner scanner = new Scanner(System.in);

        for (int i = pos; i < array.length; i++) {

            System.out.print("Введите число " + (i + 1) + ": ");

            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
                pos++;
            } else if (scanner.hasNextLine()) {
                System.out.println("Ошибка! Введите целое число!");
                return continuingInputNumbers(array, pos);
            }

        }

        return array;
    }

}
