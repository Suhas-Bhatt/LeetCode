class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums); 
       int res = Integer.MAX_VALUE;
       int l = 0;
       int r = k-1;

       while(r<nums.length){
        res= Math.min(res,nums[r]-nums[l]);
        l=l+1;
        r=r+1;
       }
       return res;
    }
}