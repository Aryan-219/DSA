package Arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 4,2, 5, 6, 7 };
        System.out.println(checkSorted(arr));
    }

    static boolean checkSorted(int[] arr) {
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] <= arr[index + 1]) {

            return helper(arr, index + 1);
        } else {
            return false;
        }
    }
}
