/**
 * Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита
 */



public class Task1 {

    public static void main(String[] args) {

        char firstSymbol = 'a';
        char lastSymbol = 'z';

        for (int i = (int) firstSymbol; i <= (int) lastSymbol; i++) {
            System.out.print((char)i + " ");

        }

        System.out.println();

        for (char i = 'a'; i <= 'z'; i++) {

            System.out.print(i + " ");
        }
    }
}
