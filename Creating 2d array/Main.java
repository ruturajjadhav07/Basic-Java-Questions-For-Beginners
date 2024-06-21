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
                    System.out.print("Enter " + i + " and " + j+" :");
                    num[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(num[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
