import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {


        int[] nums = new int[100];


        for (int i = 0; i <= nums.length; i++) {
            if (i % 2 != 0) {
                nums[i] += i;
            }

        }
        /*for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && i != 99) {
                System.out.print(nums[i] + ", ");
            } else if (nums[i] != 0 && i == 99) {
                System.out.print(nums[i] + ".");
            }
        }
        System.out.println();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0 && i != 1) {
                System.out.print(nums[i] + ", ");
            } else if (nums[i] != 0 && i == 1) {
                System.out.print(nums[i] + ".");
            }
        }*/
        //sort(nums);
        Arrays.sort(nums);
        int[] arr = Arrays.copyOfRange(nums, findPos(nums), nums.length);
        System.out.println(Arrays.toString(arr));



    }

    public static int findPos(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 1) {
                pos++;
            }

        }
        return pos;
    }
}
