class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int x = k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                x += k;
            }
        }
        return x;
    }
}