import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + ",");
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
