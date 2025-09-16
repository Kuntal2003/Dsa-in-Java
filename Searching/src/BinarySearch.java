public class BinarySearch {
    public static void main(String[] args){
        int[] acsArr = {1,2,3,4,5,6,7,8,9,10};
        int[] desArr = {10,9,8,7,6,5,4,3,2,1};
        int target = 6;
        System.out.println(binarySearch(desArr,target));

    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean acsOrderCheck = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else{
                if(acsOrderCheck){
                    if(arr[mid] > target){
                        end = mid-1;
                    }else{
                        start = mid+1;
                    }
                }else{
                    if(arr[mid] > target){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
            }
        }
        return -1;
    }
}
