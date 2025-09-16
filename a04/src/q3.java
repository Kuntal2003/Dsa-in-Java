public class q3 {
    public static void main(String[] args){
        range(10,20);
    }
    static boolean primeChecker(int num){
        for(int i=2;i*i<=num;i++){
            if(num % i == 0){
                return false;
            }else{
                continue;
            }
        }
        return true;
    }
    static void range(int low,int high){
        for(int i = low;i<=high;i++){
            if(primeChecker(i) && i!=1){
                System.out.print(" "+i);
            }else{
                continue;
            }
        }
    }
}
