/**
 * Created by Covey on 2016/3/21.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int position = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[position++] = num;
            }
        }
        for (int i = position; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}