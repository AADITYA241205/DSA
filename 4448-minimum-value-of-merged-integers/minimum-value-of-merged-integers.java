class Solution {
    public int minMergedInteger(int[] nums) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i+=2){

            int b = nums[i+1];

            int t = b;
            int a = 10;

            while(t>=10){
                a *= 10;
                t /= 10;
            }

            int ans = nums[i]*a+b;

            min = Math.min(min,ans);
        }

        return min;
    }
}