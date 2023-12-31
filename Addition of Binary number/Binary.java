import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter B1 : ");
        String B1 = sc.nextLine();
        int num1 = Integer.parseInt(B1,2);

        System.out.print("Enter B2 : ");
        String B2 = sc.nextLine();
        int num2 = Integer.parseInt(B2,2);


        int sum = num1 + num2;
        String binary_number = Integer.toBinaryString(sum);                 // It is method in java related to Integer

        System.out.println(binary_number);

    }
}
