import java.util.Arrays;

public class fast_last_position {
    public static void main(String[] args){
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(solution(arr,target)));
    }
    static int[] solution(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = indexValue(arr,target,true);
        ans[1] = indexValue(arr,target,false);
        return ans;
    }
    static int indexValue(int[] arr,int target,boolean startingPosition){
        int low = 0;
        int high = arr.length -1;
        int index = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                index = mid;
                if(startingPosition){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid] < target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return index;
    }
}
