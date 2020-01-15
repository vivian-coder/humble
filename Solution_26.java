public class Solution_26 {

    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int i=0;
        //慢指针 i，快指针 j
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
