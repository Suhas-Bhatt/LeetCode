class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // if nums1.length>num2.length
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        int m = nums1.length;
        int n=nums2.length;

        int start=0;
        int end=m;
        while(start<=end){
            int partitionX=(start+end)/2;    //binary search kinda thingy;;
            int partitionY=(m+n+1)/2-partitionX;


            //if partitionX =0, means nothing is there on left side, Use -INF for maxLeftX
            //if partitionX = length of nums1, there is nothing on right side, use +INF for minRightX

            int maxLeftX = (partitionX == 0)? Integer.MIN_VALUE: nums1[partitionX-1];
            int minRightX = (partitionX==m)? Integer.MAX_VALUE: nums1[partitionX]; 

            int maxLeftY = (partitionY == 0)? Integer.MIN_VALUE: nums2[partitionY-1];
            int minRightY = (partitionY==n)? Integer.MAX_VALUE: nums2[partitionY];

            if(maxLeftX<= minRightY && maxLeftY<=minRightX){

                if((m+n)%2==0){
                    return ((double)Math.max(maxLeftX,maxLeftY)+Math.min(minRightX,minRightY))/2;
                } else {
                    return (double)Math.max(maxLeftX,maxLeftY);
                }
            } else if(maxLeftX>minRightY){
                end = partitionX-1;
            }else{
                start=partitionX+1;
            }



        }

        throw new IllegalArgumentException();
    }
}