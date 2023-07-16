class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // List<Integer> cur = new ArrayList<>();
        // generate(0,nums,cur,res);
        // return res;
        
        res.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int n = res.size();
            for(int j=0;j<n;j++){
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(nums[i]);
                res.add(temp);
            }
        }
        return res;
    }

//     public void generate(int index,int[]nums,List<Integer> cur,List<List<Integer>> res){
//         res.add(new ArrayList(cur));

//         for(int i=index;i<nums.length;i++){
//             cur.add(nums[i]);
//             generate(i+1,nums,cur,res);
//             cur.remove(cur.size()-1);
//         }
//     }
}