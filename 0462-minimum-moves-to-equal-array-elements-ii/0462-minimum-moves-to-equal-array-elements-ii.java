class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        int ans = 0;
        while(low<=high){
            ans += nums[high]-nums[low];
            low++;
            high--;
        }
        return ans;
        
    }
}