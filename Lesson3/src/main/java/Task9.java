public class Task9 {
    public static void main(String[] args) {
        int value = 12345;
        int result = sum(value);
        System.out.println(result);
    }

    private static int sum(int value) {
        int result = 0;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue > 0; currentValue /= 10) {
            int number = currentValue % 10;
            result += number;
        }
        return result;
    }
}
