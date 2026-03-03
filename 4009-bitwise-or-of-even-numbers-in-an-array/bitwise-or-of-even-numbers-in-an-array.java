class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int count = 0;

        for(int num:nums){
            if(num%2==0){
                count |= num;
            }
        }



        return count;
    }
}