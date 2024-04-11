import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        // int[] arr = {10,15,14,33,18,99,7,-90,67,78,33,12,0,-22,0};
        int[] arr = {};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr){
        
        for(int i = 0; i<= arr.length-2; i++){
            int j = i +1;
            while(j>0 &&  arr[j-1]>arr[j] ){
                
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    } 
}
