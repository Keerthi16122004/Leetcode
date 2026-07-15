class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majo=0;
        for(int n:nums){
            if(count==0){
                majo=n;
            }
            if(majo==n){
                count++;
            }
            else{
                count--;
            }
        }
        return majo;
    }
}
