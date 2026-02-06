// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i =m-1;
//         int j = n-1;
//         int k=m+n-1;
//         while(i<m && j<n){
//             if(nums1[i]<nums2[j]){
//                 nums1[k]=nums1[i];
//                 i++;
//                 k++;
//             } else{
//                 nums1[k]=nums2[j];
//                 j++;
//                 k++;
//             }
//         }

//         while(j<n){
//             nums1[k++]=nums2[j++];
//         }

//     }
// }

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for the last element in the first part of nums1
        int j = n - 1; // Pointer for the last element in nums2
        int k = m + n - 1; // Pointer for the last index in nums1

        // Merge in reverse order, from the back to the front
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
