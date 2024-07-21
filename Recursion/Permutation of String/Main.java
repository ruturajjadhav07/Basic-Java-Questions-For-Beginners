public class Main {

    public static void print(String name, String permutations) {
        if (name.length() == 0) {
            System.out.println(permutations);
            return;
        }

        for (int i = 0; i < name.length(); i++) {
            char current = name.charAt(i);
            String newstr = name.substring(0, i) + name.substring(i + 1);
            print(newstr, permutations + current);
        }
    }

    public static void main(String[] args) {
        String name = "abc";
        print(name, "");
    }
}
