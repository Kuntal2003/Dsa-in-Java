import java.util.Scanner;
public class q02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base and height of the triangle");
        double base = input.nextDouble();
        double height = input.nextDouble();
        double formula = (double)1/2;
        System.out.println("The area of the triangle is "+(formula*base*height));
    }
}
