import java.util.Arrays;
public class CycleSort {
    public static void main(String[] args) {
        // int[] arr = {3,5,2,1,4,3,2,4};
        int[] arr = {3,5,2,1,4};
        // int[] arr = {3,5,-1,-55,0,2,1,4}; // is invalid because cycle sort works only when no.s are in the range of 1 to n
        // int[] arr = {};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }

    public static int[] cycleSort(int[] arr){

        for(int i=0; i <= arr.length-1; i++){
            while(arr[i]!= i+1){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

}

// This is my implementation of Cycle Sort algorithm
