/**
 * Метод должен вернуть среднее значение из массива чисел
 * (необходимо сумму всех элеменов массива разделить на длину массива)
 * <p>
 * Example:
 * array = {1,2,3,4,5}
 * Метод должен return 3.0
 */
public class Task12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 10};
        System.out.println(average(array));
    }

    public static double average(int[] array) {
        double result = 0;
        if (array != null) {
            for (int arrayList : array) {
                result += arrayList;
            }
            return result / array.length;
        }
        return result;

    }
}
