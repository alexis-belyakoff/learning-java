import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int factorial = scanner.nextInt();
        int result = 1;

        for (int i = 1; i < factorial + 1; i++){
            result = result * i;
        }

        System.out.println("Факториал " + factorial + ": " + result);
    }
}
