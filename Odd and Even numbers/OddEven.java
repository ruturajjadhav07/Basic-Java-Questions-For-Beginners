import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num = sc.nextInt();

        System.out.println("Entered number is "+num);
        if(num % 2 == 0){
            System.out.println("Entered number "+num+" is even number");
        }else {
            System.out.println("Entered number "+num+" is odd number");
        }

    }

}
