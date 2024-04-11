// https://leetcode.com/problems/set-mismatch/description/

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        cycleSort(nums);
        int[] result = new int[2];
        for(int i=0; i <= nums.length-1; i++){
            if(nums[i]!= i+1){
                result[0] = nums[i];
                result[1] = i+1;
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