/**
     2) ќдноклеточна€ амеба каждые 3 часа делитс€ на 2 клетки. ќпределить,
     сколько амеб будет через 3, 6, 9, 12,..., 24 часа

 */
public class Task4 {
    public static void main(String[] args) {
        replicate(3);
    }
    public static void replicate(int hours) {
        int result = (hours / 3) * 2;
        System.out.println(" оличество амеб через " + hours + " ч. - " + result);
    }
}
