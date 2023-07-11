class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length();
        int f= n-1;
        for(int i=n-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                f=i;
                break;
            }
        }
        return num.substring(0,f+1);
    }
}