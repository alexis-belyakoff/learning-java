/**
 * 1. Метод должен вернуть сумму двух чисел a и b
 * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
 **/
public class Task10 {
    public static void main(String[] args) {
        System.out.println(Sum(Integer.MAX_VALUE, Integer.MAX_VALUE));

    }

    public static int Sum(int valueFirst, int valueSecond) {

        if ((long) valueFirst + valueSecond > Integer.MAX_VALUE) {

            return -1;
        }

        return valueFirst + valueSecond;


    }
}
