//Square and Cube
public class Number {

    public void Mynumber(int number){
        int square = number * number;
        int cube = number * number * number;

        System.out.println("The square of " + number + " is " + square);
        System.out.println("The cube of " + number + " is " + cube);

    }
    
    public static void main(String[] args) {
        Number num = new Number();
        num.Mynumber(3);
    }

}
