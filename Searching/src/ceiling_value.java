public class ceiling_value {
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        int value = ceiling_value_ans(arr,target);
        System.out.println(value);
    }
    static int ceiling_value_ans(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        if(target > arr[high]){
            return -1;
        }
        if(target < arr[low]){
            return -1;
        }
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else{
                if(arr[mid] < target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return arr[high + 1];
    }

}
