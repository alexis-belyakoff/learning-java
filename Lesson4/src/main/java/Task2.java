/**
 * Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
 * <p>
 * a)                  b)
 * *        *
 * * *        * *
 * * * *        * * *
 * * * * *        * * * *
 * <p>
 * c)                  d)
 * * * * *        * * * *
 * * * *        * * *
 * * *        * *
 * *        *
 */

public class Task2 {

    public static void main(String[] args) {
        char[][] print = new char[4][4];

        for (int i = 0; i < print.length; i++) {
            for (int j = i; j < print.length; j++) {
                print[j][i] += '*';

            }

        }

        for (char[] arr : print) {
            System.out.println(arr);

        }
    }
}
