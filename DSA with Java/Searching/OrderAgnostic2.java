// This is the approach followed by Kunal

public class OrderAgnostic2 {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {7,6,4,3,2,1,0};
        System.out.println(orderAgnsotic(arr1, 7));
        System.out.println(orderAgnsotic(arr2, 4));
    }
    public static int orderAgnsotic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid] >target){
                    if(isAsc){

                        end = mid-1;
                    }else{
                        
                        start = mid + 1;
                    }
                }else{
                    if(isAsc){
                        
                        start = mid + 1;
                    }else{

                        end = mid-1;
                    }
                }
            }
            return -1;
        
    }
}
