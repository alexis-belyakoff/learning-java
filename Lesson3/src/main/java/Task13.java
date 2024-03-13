/**
 * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
 **/
public class Task13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 231236, 10};
        System.out.println(maxNum(array));
    }

    public static int maxNum(int[] array) {
        if (array != null && array.length > 0) {
            int result = array[0];
            for (int value : array) {
                if (value > result) {
                    result = value;
                }

            }
            return result;
        }
        return -1;
    }
}
