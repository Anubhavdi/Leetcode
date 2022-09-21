class Solution {
    public int jump(int[] nums) {
        int curMax=0;
        int curReach=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(curMax<nums[i]+i)
                curMax=nums[i]+i;
            if(i==curReach){
                curReach=curMax;
                count++;
            }
        }
        return count;
    }
}