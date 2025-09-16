import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Enter which operation you want to performed");
        String operation = input.next();
        switch (operation){
            case "*":
                System.out.println(num1 +" * "+num2+" = "+(num1*num2));
                break;
            case "/":
                System.out.println(num1 +" / "+num2+" = "+(num1/num2));
                break;
            case "-":
                System.out.println(num1 +" - "+num2+" = "+(num1-num2));
                break;
            case "+":
                System.out.println(num1 +" + "+num2+" = "+(num1+num2));
                break;
            default:
                System.out.println("Wrong operation");
        }
    }
}
