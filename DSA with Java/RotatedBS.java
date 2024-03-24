public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 9, 10, 0, 1, 2, 3, 4, 5 };
        // int[] arr = { 3, 1 };
        System.out.println(findInRotatedArray(arr, 3));
    }

    public static int findInRotatedArray(int[] arr, int target) {
        int pivot = findPivot(arr);
        System.out.println(pivot);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] <= target) {

            return binarySearch(arr, target, 0, pivot);

        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }

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

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}