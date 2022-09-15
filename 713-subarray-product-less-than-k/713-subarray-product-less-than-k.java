class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if(k<=1) return 0;
        int n = nums.length;
        int count=0;
        int left = 0;
        int prod = 1;
        for(int i=0;i<n;i++){
            prod *= nums[i];
            while(prod>=k){
                prod /= nums[left++];
            }
            count += i-left+1;
        }
        return count;
        
        
        
        
        
        
        
        
        // int n = nums.length;
        // if(n<=1) return 0;
        // int count =0;
        // int prod = 1;
        // for(int i=0;i<n;i++){
        //     prod = nums[i];
        //     if(prod<k)
        //         count++;
        //     for(int j=i+1;j<n && prod<k;j++){
        //         prod *= nums[j];
        //         if(prod<k)
        //             count++;
        //     }
        // }
        // return count;
    }
}