class Solution {
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