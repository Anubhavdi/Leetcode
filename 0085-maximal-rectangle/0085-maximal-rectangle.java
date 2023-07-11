class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] mat = new int[row][col];
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] == '1'){
                    mat[i][j] = 1;
                }else{
                    mat[i][j] = 0;
                }
            }
        }
        
        int n = mat.length;
        int m = mat[0].length;
        int[] curRow = mat[0];
        int maxAns= largestRectangleArea(curRow);
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    curRow[j]+=1;
                }else{
                    curRow[j]=0;
                }
            }
            
            int curAns= largestRectangleArea(curRow);
            maxAns = Math.max(maxAns,curAns);
        }
        return maxAns;
    }
    
    public int largestRectangleArea(int[] ht) {
        int n = ht.length;
        int[] NSR = nearestSmallRight(ht,n);
        int[] NSL = nearestSmallLeft(ht,n);
        
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = Math.max((NSR[i]-NSL[i]-1)*ht[i],ans);
        }
        return ans;
        
    }
    
    public static int[] nearestSmallRight(int[] arr,int n){
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = n;
            }else{
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
    
    public static int[] nearestSmallLeft(int[] arr,int n){
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
}