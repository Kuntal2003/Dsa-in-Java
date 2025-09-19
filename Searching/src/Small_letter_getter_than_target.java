public class Small_letter_getter_than_target {
    public static void main(String[] args){
        char[] letters = {'c'};
        char target = 'c';
        char ans = solution(letters,target);
        System.out.println(ans);
    }
    static char solution(char[] letters,char target){
        int low = 0;
        int high = letters.length-1;
        if(target >= letters[high]){
            return letters[low];
        }
        while (low <= high){
            int mid = (low+high) / 2;
            if(letters[mid] == target){
                return letters[mid+1];
            }else{
                if(letters[mid] < target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return letters[low];
    }
}
