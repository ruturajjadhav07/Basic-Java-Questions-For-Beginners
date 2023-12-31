import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        String numbers = sc.nextLine();
        n = Integer.parseInt(numbers);

        
        for (int i=0;i<=n; i++){
            sum += i;
        }
        System.out.println("sum of "+ n +" numbers is "+ sum);
    }
}
