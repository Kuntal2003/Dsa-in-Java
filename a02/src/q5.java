import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Bigger number is " + (num1>num2?num1:num2));
    }
}
