
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {

        int[] array = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };
        Arrays.sort(array);
        System.out.println("Elements in sorted array : ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
