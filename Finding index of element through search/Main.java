import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println(x + " found at " + i + " position");
            }
        }

    }
}
