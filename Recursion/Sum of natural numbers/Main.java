public class Main {

    public static void printNum(int i, int num, int sum) {
        if (i == num) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printNum(i+1, num, sum);
    }

    public static void main(String[] args) {
        printNum(1, 5, 0);
    }
}

