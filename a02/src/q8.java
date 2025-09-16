import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string");
        String name = input.next();
        name = name.toLowerCase();
        int start = 0;
        int end = name.length()-1;
        while(true){
            if(start>end){
                System.out.println("String is palindrome");
                break;
            }else if(name.charAt(start) == name.charAt(end)){
                start++;
                end--;
            }else{
                System.out.println("String is not palindrome");
                break;
            }
        }
//        System.out.println(name.charAt(0));
    }
}
