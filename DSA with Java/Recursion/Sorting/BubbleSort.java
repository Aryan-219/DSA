package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 54,2,56,3434,21 };
        bubbleSort(arr);
        for(int x: arr){
            System.out.print(x + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        helper(arr, arr.length, 0);
    }

    static void helper(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c<r-1) {
            // System.out.print("*");
            if (arr[c] > arr[c + 1]) {
                swap(arr, c, c + 1);
            }
            helper(arr, r, c + 1);
        } else {
            // System.out.println();
            helper(arr, r - 1, 0);
        }

    }

    static void  swap(int[] arr, int x, int y ){
        int temp = arr[x];
        arr[x]= arr[y];
        arr[y]=temp;
        
    }

}
