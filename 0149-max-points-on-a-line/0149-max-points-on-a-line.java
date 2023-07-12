class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n==1 || n==2)return n;
    
      int ans = 0;
      Map<Double, Integer> hm = new HashMap<>();
      for(int [] p1:points){
         int count=0; 
         for(int[] p2:points){
            if(p2[0] == p1[0] && p2[1] == p1[1]){
              count++;
              continue;
            }
            double slope = (double)(p2[1] - p1[1])/(double)(p2[0] - p1[0]);
            hm.put(slope, hm.getOrDefault(slope, 0)+1);
            ans = Math.max(ans,hm.get(slope)+count);
            
         }
        //  for(int values : hm.values())
        //   ans = Math.max(ans, values+count);
           
          hm.clear(); 
      }
      
      return ans;
        
        
        // int n = p.length;
        // if(n<=2) return n;
        // int max = 2;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int cur = 0;
        //         for(int k=0;k<n;k++){
        //             if(((p[j][1]-p[i][1])*(p[i][0]-p[k][0])) == ((p[i][1]-p[k][1])*(p[j][0]-p[i][0]))){
        //                 cur++;
        //             }
        //         }
        //         max = Math.max(max,cur);
        //     }
        // }
        // return max;
        
        
        // int ans = 0;
        // for (int i = 0; i<points.length; ++i){
        //     Map<Double, Integer> check = new HashMap<>();
        //     for (int  j = i+1; j<points.length; ++j){
        //         double slope;
        //         if (points[i][0] == points[j][0])
        //             slope = Double.MAX_VALUE;
        //         else{
        //             slope = (points[i][1] - points[j][1]) / ((double) (points[i][0] - points[j][0]));
        //             if (slope == -0.0)
        //                 slope = 0.0;
        //         }
        //         check.put(slope, check.getOrDefault(slope, 0) + 1);
        //         ans = Math.max(ans, check.get(slope));
        //     }
        // }
        // return ans+1;
        
        
        // int ans = 0;
        // for (int[] p1:points){
        //     Map<Double, Integer> check = new HashMap<>();
        //     for (int[]  p2:points){
        //         if(p1==p2){
        //             continue;
        //         }
        //         double slope;
        //         if (p1[0] == p2[0])
        //             slope = Double.MAX_VALUE;
        //         else{
        //             slope = (p2[1] - p1[1]) / ((double) (p2[0] - p1[0]));
        //         }
        //         check.put(slope, check.getOrDefault(slope, 0) + 1);
        //         ans = Math.max(ans, check.get(slope));
        //     }
        // }
        // return ans+1;
    }
}