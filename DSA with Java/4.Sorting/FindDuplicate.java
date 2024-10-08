// https://leetcode.com/problems/find-the-duplicate-number/description/

class FindDuplicate {
    public int findDuplicate(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
        
    // Just find duplicates

    for (int index = 0; index < nums.length; index++){
        if (index != nums[index]-1){
            return nums[index];
        }
    }
    return nums.length;
        
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
