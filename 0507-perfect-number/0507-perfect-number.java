class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1){
            return false;
        }
        int sum=1;
        int i;
        for(i=2;i<num/i;i++){
            if(num%i==0){
                sum=sum+i;
                if(i !=num/i){
                    sum=sum+(num/i);
                }
            }
        }
        if(i !=1 && num==sum){
            return true;
        }
        else{
            return false;
        }
    }
}