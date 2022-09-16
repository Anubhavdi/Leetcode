class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry m:map.entrySet()){
            if((int)m.getValue()>n/3){
                list.add((int)m.getKey());
            }
        }
        return list;
    }
}