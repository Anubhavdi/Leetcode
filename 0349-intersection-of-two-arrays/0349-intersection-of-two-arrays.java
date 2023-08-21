class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
//         if(nums1.length > nums2.length)
//             return intersection(nums2, nums1);
//         int [] pre = new int[1000];
//         for(int i:nums1){
//             pre[i]=1;
//         }
//         int[] ans=new int[nums1.length];
//         int c=0;
//         Set<Integer> set = new HashSet<>();
//         for(int i:nums2){
//             set.add(i);
//         }
//         for(int i:set){
//             if(pre[i]==1){
//                 ans[c++]=i;
//             }  
//         }
        
//         return Arrays.copyOf(ans,c);
        
        
        
        Set<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        
        Set<Integer> s = new HashSet<>();
        for(int i:nums2){
            if(set.contains(i)){
                s.add(i);
            }
        }
        
        int[] res = new int[s.size()];
        int j=0;
        for(int i:s){
            res[j++] = i;
        }
        return res;
        
    }
}