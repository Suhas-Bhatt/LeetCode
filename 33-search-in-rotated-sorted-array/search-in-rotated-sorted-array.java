class Solution {
    public int search(int[] nums, int target) {
           return searchHelper(nums, target, 0, nums.length - 1);
    }

    private int searchHelper(int arr[],int tar,int si,int ei){
           //base case
         if(si>ei){
            return -1;
         }
          //kaam
         int mid=si+(ei-si)/2;
    
          //case FOUND
          if(arr[mid]==tar){
                return mid;
            }

            //mid on L1

            if(arr[si]<=arr[mid]){
                //case a: left
                if(arr[si]<=tar && tar<=arr[mid]){
                    return searchHelper(arr,tar,si,mid-1);
                } else{
                //case b:right
                    return searchHelper(arr,tar,mid+1,ei);
             }
    }

    //mid on L2
    else{
        //case c:right
        if(arr[mid]<=tar && tar<=arr[ei]){
            return searchHelper(arr,tar,mid+1,ei);
        } else {
            return searchHelper(arr,tar,si,mid-1);
        }
    }
}
}