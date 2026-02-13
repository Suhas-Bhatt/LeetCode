class Solution {
    public int maximumCount(int[] nums) {
        int c=0;
        int f=0;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                c++;
            } else if(nums[i]>0){
                f++;
            } else{
                z++;
            }
        }
        int count = Math.max(c,f);
        return count;
    }
}