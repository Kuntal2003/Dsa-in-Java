import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        int numCheck = 0;
        int countTen = 0;
        int ten = 10;
        while(true){
            if(number == numCheck){
                break;
            }else{
                numCheck = number%ten;
                ten = ten*10;
                countTen++;
            }
        }
        ten = 10;
        double sum = 0;
        int reminderDivisor = 1;
        int needToMinus = 0;
        for(int i = 1;i<=countTen;i++){
            int last = (number%ten)-needToMinus;
            int reminder = last/reminderDivisor;
            sum = sum + Math.pow(reminder,countTen);
            reminderDivisor = reminderDivisor*10;
            needToMinus = number%ten;
            ten = ten*10;
        }
        if(number == (int)sum){
            System.out.println("The number is a armstrong number");
        }else{
            System.out.println("The number is not a armstrong number");
        }
    }
}
