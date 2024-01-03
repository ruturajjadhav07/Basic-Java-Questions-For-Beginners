// Sum of elements in given array

public class SumofArray {
    public static void main(String[] args) {
        int sum = 0;
        int [] array = {2,4,21,5,6,7,2};

        for (int i : array){
            sum += i;
        // System.out.println(sum);               // This will give in loop
        }
        System.out.println("The sum of array number is "+sum);

    }
}
