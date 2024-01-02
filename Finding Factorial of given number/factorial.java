import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        int factor = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            factor = factor * i;
//            System.out.println(factor);
        }

        System.out.println("Factorial of " + num + " is: " + factor);

    }
}
