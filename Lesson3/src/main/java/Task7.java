public class Task7 {
    public static void main(String[] args) {
        int num = -12312331;

        boolean lastNum = num % 10 == 3 || num % 10 == - 3;
        if (lastNum) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
