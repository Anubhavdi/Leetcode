class Solution {
    public int maxPoints(int[][] p) {
        int n = p.length;
        if(n<=2) return n;
        int max = 2;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int cur = 0;
                for(int k=0;k<n;k++){
                    if(((p[j][1]-p[i][1])*(p[i][0]-p[k][0])) == ((p[i][1]-p[k][1])*(p[j][0]-p[i][0]))){
                        cur++;
                    }
                }
                max = Math.max(max,cur);
            }
        }
        return max;
    }
}