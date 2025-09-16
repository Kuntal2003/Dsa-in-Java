public class qI17 {
    public static void main(String[] args){
        int number = 12321;
        int RealNumber = number;
        int count = 0;
        while(number>0){
            count++;
            number = number/10;
        }
        int [] arr = new int[count];
        for(int i =0; i< count;i++){
            arr[i] = RealNumber%10;
            RealNumber = RealNumber/10;
        }
        int first = 0;
        int second = count-1;
        while(first<second){
            if(arr[first]==arr[second]){
                first++;
                second--;
            }else{
                System.out.println("The number is not palindrome");
                System.exit(1);
            }
        }
        System.out.println("The number is palindrome");
    }
}
