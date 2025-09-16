import java.util.Scanner;
public class q10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int rem;
        int reverse_number = 0;
        while(number>0){
            rem = number%10;
            reverse_number = rem+(10*reverse_number);
            number = number/10;
        }
        System.out.println(reverse_number);
    }
}
