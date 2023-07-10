class Solution {
    public int findComplement(int num) {
        
        // if(num==0) return 1;
        // int x = (int)(Math.log(num)/Math.log(2))+1;
        // int mask = (1<<x)-1;
        // return num^mask;
        
        int n = 0;
        while(n<num){
            n = (n<<1)|1;
        }
        return n-num;
        
    }
}