/**
 * Ќапишите реализацию метода summ(int a, int b), вычисл€ющий a*b, не пользу€сь операциеи?
 * умножени€, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println(summ(5, 2)); // 10
        System.out.println(summ(7, 6)); // 42
        System.out.println(summ(3, 0)); // 0
        System.out.println(summ(-1, -0)); // -3
        System.out.println(summ(-3, -1)); // 3
    }

    public static int summ(int a, int b) {
        int result = 0;
        if (a < 0 && b < 0) {
            for (int i = a; a < 0; a++) {
                result += -b;
            }
        } else if (a < 0 || b < 0) {
            if (a < b) {
                for (int i = a; a < 0; a++) {
                    result += -b;
                }
            } else {
                for (int i = a; a > 0; a--) {
                    result += b;
                }
            }
        } else {
            for (int i = a; a > 0; a--) {
                result += b;
            }
        }
        return result;
    }
}
