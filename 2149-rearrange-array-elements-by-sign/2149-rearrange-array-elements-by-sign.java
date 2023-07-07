class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        
        int[] res = new int[n];
        int i=0,j=0;
        for(int k=0;k<n;k++){
            if(k%2==0){
                res[k] = pos.get(i++);
            }else{
                res[k] = neg.get(j++);
            }
        }
        return res;
        
    }
}