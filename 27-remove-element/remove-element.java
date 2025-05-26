public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Points to the next position to insert non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Overwrite the value
                k++;
            }
        }

        return k;  // New length after removal
    }
}
