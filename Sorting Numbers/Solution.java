
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        System.out.println("Sorted numbers:");
        for (int i = 0; i < num; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
