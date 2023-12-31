public class rectangle {

    public void perimeter(int length,int breadth){
        int perimeter = 2 * (length + breadth);     // formula
        System.out.println("Perimeter of rectangle : " +perimeter);
    }

    public static void main(String[] args) {

        rectangle perimeter = new rectangle();       
        perimeter.perimeter(10,20);


    }
}

// You can try same for circle triangle.
