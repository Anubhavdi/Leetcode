class pair{
    int val;
    int freq;
    pair(int v,int f){
        this.val = v;
        this.freq = f;
    }
}


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        PriorityQueue<pair> minh = new PriorityQueue<>((a,b)->(b.freq-a.freq));
        for(int key:mp.keySet()){
            minh.add(new pair(key,mp.get(key)));
        }
        
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = minh.peek().val;
            minh.poll();
        }
        return res;
        
        
        
        
        
        
        
        
        

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // PriorityQueue<pair> minh = new PriorityQueue<>((a,b)->(b.freq-a.freq));
        // for(int key:map.keySet()){
        //     minh.add(new pair(key,map.get(key)));
        //     // if(minh.size()>k){
        //     //     minh.poll();
        //     // }
        // }
        // int[] res = new int[k];
        // int j = 0;
        // while(j!=k){
        //     res[j++]=minh.peek().val;
        //     minh.poll();
        // }
        // return res;


        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // int[] res = new int[k];
        // PriorityQueue<Integer> minh = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));

        // for(int key:map.keySet()){
        //     minh.add(key);
        // }

        // for(int i=0;i<k;i++){
        //     res[i] = minh.poll();
        // }

        // return res;
    }
}