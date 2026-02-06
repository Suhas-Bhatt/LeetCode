// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int nextGreater[] = new int[nums1.length];
//         Stack<Integer> s = new Stack<>();

//         for(int i=nums2.length-1;i>=0;i--){
//             while(!s.isEmpty() && nums2[s.peek()]<=nums2[i]){
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 nextGreater[i]=-1;
//             }else{
//                 nextGreater[i] = nums2[s.peek()];
//             }
//             s.push(i);



//         }
//         return nextGreater;
//     }
// }

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Step 1: Next Greater Element for nums2
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        // Step 2: Build answer for nums1
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = nge[j];
                    break;
                }
            }
        }

        return result;
    }
}
