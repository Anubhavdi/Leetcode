class Solution {
    public boolean isHappy(int n) {
          if(n==1 || n==7) return true;
        int sum=n,temp=n;
        while(sum>9){
            sum=0;
            while(temp>0){
                int s=temp%10;
                sum += s*s;
                temp /= 10;
            }
            if(sum==1) return true;
            temp=sum;
        }
        if(sum==7) return true;
        return false;
    }
}