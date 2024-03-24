// This is the approach followed by me: Here I check before hand whether the array recieved is ascending or descending. If the array recieved is ascending, then I have a searate while loop for that, and if the array recieved is descending, then I have a different loop for that.
// This approach prevents the checking of if(isAsc) in every iteration.

public class OrderAgnostic {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,5,6,7,8};
        int[] arr2 = {7,6,4,3,2,1,0};
        System.out.println(orderAgnsotic(arr1, 7));
        System.out.println(orderAgnsotic(arr2, 8));
    }
    public static int orderAgnsotic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        if(isAsc){
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid] >target){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
            return -1;
        }else{
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[mid]==target){
                    return mid;
                }
                if( arr[mid] <target){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
            return -1;
        }
        
    }
}
