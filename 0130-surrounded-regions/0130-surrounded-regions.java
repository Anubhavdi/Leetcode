class Solution {
    
    public static void dfs(int r,int c,int[][] visi,char[][] matrix,int[] delrow,int[] delcol){
        visi[r][c] = 1;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<4;i++){
            int rr = r+delrow[i];
            int cc = c+delcol[i];
            
            if(rr>=0 && rr<n && cc>=0 && cc<m && visi[rr][cc]==0 && matrix[rr][cc]=='O'){
                dfs(rr,cc,visi,matrix,delrow,delcol);
            }
        }
    }
    public void solve(char[][] board) {
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        int n = board.length;
        int m = board[0].length;
        int[][] visi = new int[n][m];
        
        for(int i=0;i<n;i++){
            if(visi[i][0]==0 && board[i][0]=='O'){
                
                dfs(i,0,visi,board,delrow,delcol);
            }
            if(visi[i][m-1]==0 && board[i][m-1]=='O'){
                
                dfs(i,m-1,visi,board,delrow,delcol);
            }
        }
        
        for(int i=0;i<m;i++){
            if(visi[0][i]==0 && board[0][i]=='O'){
                dfs(0,i,visi,board,delrow,delcol);
            }
            if(visi[n-1][i]==0 && board[n-1][i]=='O'){
                dfs(n-1,i,visi,board,delrow,delcol);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visi[i][j]==0 && board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        }
        
    }
}