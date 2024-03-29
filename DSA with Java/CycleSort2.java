import java.util.Arrays;

public class CycleSort2 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,2,3,4};
        // int[] arr = {3,5,-1,-55,0,2,1,4}; // is invalid because cycle sort works only
        // when no.s are in the range of 1 to n
        // int[] arr = {};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }

    public static int[] cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// This is Kunal's Code