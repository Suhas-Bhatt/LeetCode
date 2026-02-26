class Solution {
    public boolean checkPerfectNumber(int nums) {
        if(nums==1) return false;
        int sum = 1;
        for(int i=2;i<nums;i++){
            if(nums%i==0){
                sum+=i;
            } else{
                continue;
            }
        }
        if(sum==nums) return true;
        return false;
    }
}