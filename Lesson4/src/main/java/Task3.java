import java.util.Random;
/**
 1) Задача на оператор switch!
    Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
    Если 6 или 7 – “Выходной”.
*/
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt((7 - 1) + 1) + 1;
        switch (r) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            default -> System.out.println("Выходные");
        }


    }
}
