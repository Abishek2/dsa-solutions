class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;

        int[] ans = new int[len];
        int i =0;
        for(int j=0;j<n;j++){
            ans[i] = nums[j];
            ans[i+1]= nums[n+j];
            i +=2;
        }

        return ans;
        
    }
} 