/**
  Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

         a)                  b)
               *        *
             * *        * *
           * * *        * * *
         * * * *        * * * *

         c)                  d)
         * * * *        * * * *
           * * *        * * *
             * *        * *
               *        *
 */

public class Task2 {

    public static void main(String[] args) {
        char[][] printC = new char[4][4];
        char[][] printB = new char[4][4];
        char[][] printA = new char[4][4];
        char[][] printD = new char[4][4];

        for (int i = 0; i < printA.length; i++) {
            for (int j = printA.length - 1; j >= 0; j--) {
                printA[i][j] += '*';

            }

        }

        for (char[] arr : printA) {
            System.out.println(arr);

        }

        System.out.println();

        for (int i = printC.length; i >= 0; i--) {
            for (int j = i; j < printC.length; j++) {
                printC[i][j] += '*';

            }

        }

        for (char[] arr : printC) {
            System.out.println(arr);

        }

        System.out.println();

        for (int i = 0; i < printB.length; i++) {
            for (int j = i; j >= 0; j--) {
                printB[i][j] += '*';

            }

        }

        for (char[] chars : printB) {
                    System.out.println(chars);

        }

    }
}
