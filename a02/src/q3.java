import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter p,t,r");
        double p = input.nextDouble();
        double t = input.nextDouble();
        double r = input.nextDouble();
        System.out.println("Simple interest = "+(p*r*t)/100);
    }
}
