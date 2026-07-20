class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        int sum = 0;
        for(int num:nums){
            if(num>max){
            max=num;
            }
        }
        for ( int i=0;i<k;i++){
            sum+=max;
            max++;
        }
        return sum;
    }
}