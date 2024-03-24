// This is my implementation

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(mid == 0)
            break;
            if (arr[mid - 1] >= arr[mid]) {
                end = mid;
            } else {
                if (arr[mid] <= arr[mid + 1]) {
                    if(start == mid){
                        break;
                    }
                    start = mid;
                } else {
                    return start+1;
                    
                }
            }
        }
        return start+1;
    }
}