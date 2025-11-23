class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: if array is empty
        if (nums.length == 0) {
            return 0;
        }

        // Pointer for the position of the next unique element
        int idx = 1;  

        // Loop through the array
        for (int i = 1; i < nums.length; i++) {
            // If the current number is not equal to the previous one,
            // it’s a new unique number.
            if (nums[i] != nums[i - 1]) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        // idx represents the count of unique elements
        return idx;
    }
}
