import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows :");
            int a = sc.nextInt();
            System.out.print("Enter number of columns :");
            int b = sc.nextInt();
            int[][] num = new int[a][b];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print("Enter " + i + " and " + j + " :");
                    num[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Enter number to find index :");
            int x = sc.nextInt();
            boolean found = false;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (num[i][j] == x) {
                        System.out.println("The number " + x + " found at location (" + i + "," + j + ")");
                        found = true;
                    }
                }
                System.out.println();
            }
            if (!found) {
                System.out.println("The number " + x + " is not found in array");
            }
        }

    }
}
