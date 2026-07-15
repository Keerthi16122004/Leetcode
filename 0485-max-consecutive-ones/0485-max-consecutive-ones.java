class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int consecutiveCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutiveCount++;
                if(consecutiveCount > max) {
                    max = consecutiveCount;
                }                
                
            } else {
                consecutiveCount = 0;
            } 
        }

        return max;
    }
}