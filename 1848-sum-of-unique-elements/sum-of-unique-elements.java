class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums[0] == nums[n-1]) return 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            
            if ((i == 0 || nums[i] != nums[i - 1]) &&
                (i == n - 1 || nums[i] != nums[i + 1])) {
                
                sum += nums[i];
            }
        }
        return sum;
    }
}