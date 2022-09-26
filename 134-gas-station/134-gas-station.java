class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int start = 0;
    int leftSum = 0;
    int rightSum = 0;
	
    for (int i = 0; i < gas.length; i++) {
      if (rightSum < 0) {
        start = i;
        leftSum += rightSum;
        rightSum = 0;
      }
      rightSum += gas[i] - cost[i];
    }
	
    return leftSum + rightSum < 0 ? -1 : start; 
  }
}