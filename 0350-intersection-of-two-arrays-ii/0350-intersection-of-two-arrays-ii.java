class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
//         if(nums1.length>nums2.length){
//             intersect(nums2,nums1);
//         }
        
//         int[] freq = new int[1001];
//         for(int i:nums1){
//             freq[i] += 1;
//         }
        
//         int[] res = new int[nums1.length];
//         int j=0;
//         for(int i:nums2){
//             if(freq[i]>0){
//                 res[j++] = i;
//                 freq[i] -= 1;
//             }
//         }
        
        
//         return Arrays.copyOf(res,j);
        
        
        List<Integer> list = new ArrayList<>();
        for(int i:nums1){
            list.add(i);
        }
        
        int[] res = new int [nums1.length];
        int j = 0;
        for(int i:nums2){
            if(list.contains(i)){
                res[j++] = i;
                list.remove(Integer.valueOf(i));
                
            }
        }
        return Arrays.copyOf(res,j);
        
    }
}