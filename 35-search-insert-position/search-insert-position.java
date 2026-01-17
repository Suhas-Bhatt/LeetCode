// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int count = 0;
//         for(int i=0;i<nums.length;i++){
//             count++;
//             if(nums[count]==target){
//                 return count;
//             } else {
//                 count=0;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if (target < nums[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return start ;
 
    }
}