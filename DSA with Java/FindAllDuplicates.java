
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        cycleSort(nums);

        List<Integer> result = new ArrayList<>();
        for(int i=0; i <= nums.length-1; i++){
            if(nums[i]!= i+1){
                result.add(nums[i]);
            }
        }
        return result;
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