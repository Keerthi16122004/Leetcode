class Solution {
    public int fib(int n) {
      int fir=0;
      int sec=1;
      int next=0;
      if(n==0){
        return 0;
      }  
      else if(n==1){
        return 1;
      }
      for(int i=2;i<=n;i++){
        next=fir+sec;
        fir=sec;
        sec=next;
      }
      return next;
    }
}