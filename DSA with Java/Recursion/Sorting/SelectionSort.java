package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 54,0,43,2 };
        selectionSort(arr);
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
    static void selectionSort(int[] arr){
         helper(arr, arr.length, 0);
    }
    static int max=0;
    static void helper(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                max=c;
            }
            helper(arr, r, c+1);
        }else{
            swap(arr, max, c-1);
            max=0;
            helper(arr, r-1, 0);
        }
    }
    static void  swap(int[] arr, int x, int y ){
        int temp = arr[x];
        arr[x]= arr[y];
        arr[y]=temp;
        
    }
}