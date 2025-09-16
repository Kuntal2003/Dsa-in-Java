import java.util.Scanner;
public class q03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height and width");
        double height = input.nextDouble();
        double width = input.nextDouble();
        System.out.println("Area of a triangle is "+height*width);
    }
}
