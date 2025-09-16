import java.util.Scanner;
public class q22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int sum = 0;
        int product = 1;
        while(n>0){
            int lastNumber = n%10;
            sum = sum + lastNumber;
            product = product*lastNumber;
            n = n/10;
        }
        System.out.println(product-sum);
    }
}
