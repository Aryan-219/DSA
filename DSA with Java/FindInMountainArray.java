public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,2,1,};
        System.out.println(findInMountainArray(arr, 4));
    }

    public static int findInMountainArray(int[] arr, int target){
        int peak = findPeak(arr);
        int ans = orderAgnsotic(arr, target, 0,peak);
        if(ans != -1){
            return ans;
        }else{
            return orderAgnsotic(arr, target, peak, arr.length-1);
        }
        
    }
    public static int orderAgnsotic(int[] arr, int target, int start, int end) {
        
        boolean isAsc = arr[start] < arr[end];
        if (isAsc) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

    }

    public static int findPeak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        if (s == e) {

            return s;
        } else {
            return -1;
        }
    }
}
