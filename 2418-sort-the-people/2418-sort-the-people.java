class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // int n = heights.length;
        // Map<Integer,String> map = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     map.put(heights[i],names[i]);
        // }
        // Arrays.sort(heights);
        // String[] str = new String[n];
        // int index=0;
        // for(int i=n-1;i>=0;i--){
        //     str[index++]=map.get(heights[i]);
        // }
        // return str;
        
        
        // int n = heights.length;
        // TreeMap<Integer,String> treeMap = new TreeMap<>();
        // for(int i=0;i<n;i++){
        //     treeMap.put(heights[i],names[i]);
        // }
        // return treeMap.descendingMap().values().toArray(new String[0]);
        
        
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                    
                    String name = names[i];
                    names[i] = names[j];
                    names[j] = name;
                }
            }
        }
        return names;
        
    }
}