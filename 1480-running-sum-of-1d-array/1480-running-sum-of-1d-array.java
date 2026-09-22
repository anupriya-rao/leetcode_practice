class Solution {
    public int[] runningSum(int[] nums) {
        int n = 0;
        int[] result = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            n = n + nums[i] ;
            result[i] = n;
        }
        return result;
    }
}