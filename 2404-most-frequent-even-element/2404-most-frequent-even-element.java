class Solution {
    public int mostFrequentEven(int[] nums) {
        
        int[] arr=new int [100001];
        for(int i:nums){
            if(i%2==0){
                arr[i]++;
            }
        }
        int ans=0 , max =-1;
        for(int i=0;i<100001;i++){
            if(arr[i]>max){
                max=arr[i];
                ans=i;
            }
        }
        if(max==0) return -1;
        return ans;
    }
}
