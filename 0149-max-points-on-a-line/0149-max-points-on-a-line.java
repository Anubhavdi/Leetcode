class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n==1 || n==2)return n;
    
      int ans = 0;
      Map<Double, Integer> hm = new HashMap<>();
      for(int [] p1:points){
         // int count=0; 
         for(int[] p2:points){
            if(p2==p1){
              // count++;
              continue;
            }
            double slope = (double)(p2[1] - p1[1])/(double)(p2[0] - p1[0]);
            hm.put(slope, hm.getOrDefault(slope, 0)+1);
            ans = Math.max(ans,hm.get(slope));
            
         }
        //  for(int values : hm.values())
        //   ans = Math.max(ans, values+count);
           
          hm.clear(); 
      }
      
      return ans+1;
        
        
    
        
        
        // int ans = 0;
        // for (int[] p1:points){
        //     Map<Double, Integer> check = new HashMap<>();
        //     for (int[]  p2:points){
        //         if(p1==p2){
        //             continue;
        //         }
        //         double slope;
        //         slope = (p2[1] - p1[1]) / ((double) (p2[0] - p1[0]));
        //         check.put(slope, check.getOrDefault(slope, 0) + 1);
        //         ans = Math.max(ans, check.get(slope));
        //     }
        // }
        // return ans+1;
    }
}