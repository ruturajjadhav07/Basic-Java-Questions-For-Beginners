public class fibonacci {

    public static void main(String[] args) {
        int i =0;
        int j = 1;
        int count = 10;
        int result;

        for (int n=0;n<=count;n++){
            result = i+j;
            i=j;
            j = result;
            System.out.println(j);
        }

//        System.out.println(result);
    }
}
