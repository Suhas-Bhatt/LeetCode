class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashSet<Double> s = new HashSet<>();
        if(n==2) return 1;
        int l =0;
        int r = n-1;
        while(l<r){
            double avg = (nums[l]+nums[r])/2.0;
            s.add(avg);
            l++;
            r--;
        }
        return s.size();
    }
}