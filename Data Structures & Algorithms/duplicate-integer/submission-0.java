class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int x = i + 1; x < nums.length; x++) {
                if (nums[i] == nums[x]) {
                    return true;
                }
            }
        }
        return false;
    }
}