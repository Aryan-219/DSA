public class PivotOfRotatedArray {

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 9, 10, 0, 1, 2, 3, 4, 5 };
        int pivot = findPivot(arr);
        System.out.println(pivot);
        // System.out.println(findInRotatedArray(arr, 9));
    }
    public static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[s] >= arr[mid]) {
                e = mid - 1;
            } else if (arr[s] < arr[mid]) {
                s = mid + 1;
            }
        }
        return -1;
    }
}
