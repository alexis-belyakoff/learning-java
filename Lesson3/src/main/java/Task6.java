public class Task6 {
    public static void main(String[] args) {

        int month = 14;

        String result = switch (month){
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10 , 11 -> "Autumn";
            default -> "Month is invalid";
        };

        System.out.println(result);

    }
}
