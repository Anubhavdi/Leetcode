class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        if(n==1) return nums[0];
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]) + 1;
                if(count>n/2) return nums[i];
                else map.put(nums[i],count);
            }else{
                map.put(nums[i],1);
            }
        }
        return -1;
    }
}