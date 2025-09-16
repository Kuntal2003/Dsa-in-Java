import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int range = n-2;
        if(n<=1){
            System.out.println(first);
        }else{
            System.out.print(first + " " +second+" ");
            for(int i=0;i<range;i++){
                int next = first+second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }

    }
}
