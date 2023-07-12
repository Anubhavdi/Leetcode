class Solution {
    public int kthFactor(int n, int k) {
        if(n<k) return -1;
        ArrayList<Integer>  list = new ArrayList<>();
        
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            int temp=n/list.get(i);
            if(!list.contains(temp)){
                list.add(temp);
            }
        }
        
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        if(list.size()<k) return -1;
        return list.get(k-1);
        
        
        
        
        // if(n<k) return -1;
        // int cnt = 0;
        // int ans = -1;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         cnt++;
        //         if(cnt==k){
        //             ans = i;
        //             break;
        //         }
        //     }
        // }
        // // if(list.size()<k) return -1;
        // return ans;
    }
}