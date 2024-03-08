import java.util.Scanner;

//3) � ���������� ���������� �����.
//        ���� ������� �� ����� ������� � ���� ����� ���� � ������������� ��� ��� �������������.
//        ��������, ������� �����: 5
//        "5 - ��� ������������� �����, ���������� ���� = 1"
public class Task5 {
    public static void main(String[] args) {
        intNumber();

    }

    public static void intNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ����� �����: ");

        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            System.out.println(inputNumber + " - ��� " + evenNumber(inputNumber) + " �����, " +
                    "���������� ���� = " + countDigits(inputNumber));

        } else if (scanner.hasNextLine()) {
            System.out.println("������! ������� ����� �����!");
            intNumber();
        }
    }

    public static String evenNumber(int number) {
        return number > 0 ? "�������������" : "�������������";
    }

    public static int countDigits(int number) {
        int count = 0;
        if (number != 0) {
            while (number != 0) {
                number /= 10;
                count++;
            }
        } else count = 1;

        return count;

    }
}
