// https://leetcode.com/problems/first-missing-positive/description/

class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 7, 8, 9, 11, 12 };
        // int[] nums = {1};
        // int[] nums = {1,2,0};

        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        // System.out.println(Arrays.toString(nums));
        cycleSort(nums);
        // System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    public static int[] cycleSort(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        return nums;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}