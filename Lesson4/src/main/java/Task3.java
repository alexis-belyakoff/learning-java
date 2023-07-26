import java.util.Random;

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
