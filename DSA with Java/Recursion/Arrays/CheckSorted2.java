package Arrays;

public class CheckSorted2 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 7 };
        System.out.println(checkSorted(arr));
    }

    static boolean checkSorted(int[] arr) {
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] <= arr[index + 1] && helper(arr, index + 1);

    }
}
