package Rectangle;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length;
        double width;

        System.out.println("Enter length for rectangle ");
        length = input.nextDouble();

        System.out.println("Enter width fro rectangle ");
        width = input.nextDouble();

        Rectangle rectangle = new Rectangle(length,width);

        System.out.println("Aria is: "+rectangle.calculateAria());
        System.out.println("Perimeter is: "+rectangle.calculatePerimeter());



    }
}
