// class Solution {
//     public boolean isArraySpecial(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if((nums[i]%2==0 && nums[j]%2==0) || (nums[i]%2!=0 && nums[j]%2!=0) ){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // Check if both elements are either even or both odd
            if ((nums[i] % 2 == nums[i - 1] % 2)) {
                return false;  // Found two adjacent even or two adjacent odd numbers
            }
        }
        return true;  // All adjacent pairs alternate between even and odd
    }
}
