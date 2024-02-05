import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();


        System.out.println("Факториал " + number + ": " + Factorial(number));
    }
    public static int Factorial(int num) {
        int result = 1;

        for (int i = 1; i < num + 1; i++){
            result *= i;
        }
        return result;
    }
}
