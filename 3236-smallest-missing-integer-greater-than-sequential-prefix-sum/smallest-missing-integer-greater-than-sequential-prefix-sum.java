import java.util.*;
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                sum += nums[i];
            } else {
                break;
            }
        }
        HashSet<Integer> s = new HashSet<>();
        for(int i:nums){
            if(i>=sum){
                s.add(i);
            }
        }
        while(s.contains(sum)){
            sum++;
        }
        return sum;
    }
}