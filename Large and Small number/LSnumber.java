// Find Largest among 3 numbers
import java.util.Scanner;

public class LSnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int num3 = sc.nextInt();

        System.out.println("Given numbers are : "+ num1 +", "+num2 +" and "+ num3);

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 +" is bigger among given numbers");
        } else  if (num2 >= num1 && num2 >= num3){
            System.out.println(num2 +" is bigger among given numbers");
        }else {
            System.out.println(num3 +" is bigger among given numbers");
        }


    }

}
