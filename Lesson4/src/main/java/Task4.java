/**
     2) ������������� ����� ������ 3 ���� ������� �� 2 ������. ����������,
     ������� ���� ����� ����� 3, 6, 9, 12,..., 24 ����

 */
public class Task4 {
    public static void main(String[] args) {
        replicate(3);
    }
    public static void replicate(int hours) {
        int result = (hours / 3) * 2;
        System.out.println("���������� ���� ����� " + hours + " �. - " + result);
    }
}
