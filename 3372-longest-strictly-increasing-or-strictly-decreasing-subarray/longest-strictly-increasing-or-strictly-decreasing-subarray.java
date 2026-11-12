class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int n = nums.length;
        int ans = 1;
        int c = 1;

        for(int i = 1; i < n; i++){

            if(nums[i] > nums[i - 1]){
                c++;
            }else{
                c = 1;
            }

            ans = Math.max(ans, c);
        }

        c = 1;

        for(int i = 1; i < n; i++){

            if(nums[i] < nums[i - 1]){
                c++;
            }else{
                c = 1;
            }

            ans = Math.max(ans, c);
        }

        return ans;
    }
}
