class Solution {
    public int countPrimes(int n) {
        if(n==0) return 0;
        boolean[] isprime = seiveOfEratothenes(n);
        int count=0;
        for(int i=0;i<n;i++){
            if(isprime[i]==true)
                count++;
        }
        return count;
        
    }
    
    public boolean[] seiveOfEratothenes(int num){
        boolean[] isprime = new boolean[num+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2;i*i<=num;i++){
            for(int j=2*i;j<=num;j+=i){
                isprime[j]=false;
            }
        }
        return isprime;
    }
}