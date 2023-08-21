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
        
        
//         List<Integer> list = new ArrayList<>();
//         for(int i:nums1){
//             list.add(i);
//         }
        
//         int[] res = new int [nums1.length];
//         int j = 0;
//         for(int i:nums2){
//             if(list.contains(i)){
//                 res[j++] = i;
//                 list.remove(Integer.valueOf(i));
                
//             }
//         }
//         return Arrays.copyOf(res,j);
        
        
        
//         
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i:nums1){
//             map.put(i,map.getOrDefault(i,0)+1);
//         }
        
//         int[] res = new int[nums1.length];
//         int j =0;
//         for(int i:nums2){
//             if(map.containsKey(i) && map.get(i)>0){
//                 res[j++] = i;
//                 map.put(i,map.get(i)-1);
//             }
//         }
        
//         return Arrays.copyOf(res,j);
        
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int m = nums1.length;
        int n = nums2.length;
        int res[] = new int[m];
        int c = 0;
        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
                res[c++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        return Arrays.copyOf(res,c);
        
    }
}