class Solution {
    public int dominantIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean dominant = true;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] < 2 * nums[j]) {
                    dominant = false;
                    break;
                }
            }

            if (dominant) {
                return i;
            }
        }

        return -1;
    }
}