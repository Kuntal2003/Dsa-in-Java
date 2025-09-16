public class q1 {
    public static void main(String[] args){
        int num  = min(1,2,3);
        System.out.println(num);
    }
    static int max(int ...v){
        int maxNum = v[0];
        for(int x: v){
            maxNum = maxNum>x? maxNum : x;
        }
        return maxNum;
    }
    static int min(int ...v){
        int minNum = v[0];
        for(int x : v){
            minNum = minNum >x?x:minNum;
        }
        return minNum;
    }
}
