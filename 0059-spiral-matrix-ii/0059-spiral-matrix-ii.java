class Solution {
    public int[][] generateMatrix(int n) {
        int l=0,t=0,r=n-1,b=n-1,d=0;
        int[][] m = new int[n][n];
        int num = 1;
        while(l<=r&&t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    m[t][i]=num;
                    num++;
                }
                t++;
                d=1;
            }else if(d==1){
                for(int i=t;i<=b;i++){
                    m[i][r]=num;
                    num++;
                }
                r--;
                d=2;
            }else if(d==2){
                for(int i=r;i>=l;i--){
                    m[b][i]=num;
                    num++;
                }
                b--;
                d=3;
            }else if(d==3){
                for(int i=b;i>=t;i--){
                    m[i][l]=num;
                    num++;
                }
                l++;
                d=0;
            }
        }
        return m;
    }
}