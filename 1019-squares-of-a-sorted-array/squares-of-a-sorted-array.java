class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            arr[i]=j*j;
        }



        Arrays.sort(arr);
        return arr;
    }
}