public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = {99, 0,1, 5, 3, 6, 3, 1, 5,7,5,4,3,7,8,88,54,33,2,1};
        int[] arr = {10,9,8,5,3,1};
        // int[] arr = { 0, 1, 2, 3, 4, 5, };
        arr = bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println("Flag found to be true, value of i:" + i);
                break;
            }
        }
        return arr;
    }
}

// This sorting algorithm is also known as the syncing sort or the exchange sort
// This sorting algorithm does not take extra space, therefore the space
// complexity of this algorithm is O(1) i.e. constant.
// The algorithms which do not take extra space are known as inplace sorting
// algorthms

// After performing sorting, if the original order is maintained for the values
// that were equal, then the algorithm is termed as stable
// Bubble sort algorithm is also a stable algorithm

// Complexity : Worst case : O(n square)
// Best case : O(n square)