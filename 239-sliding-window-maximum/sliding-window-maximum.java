import java.util.*;
class Solution{
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val - this.val;
        }
    }  
    public int[] maxSlidingWindow(int[] arr, int k) {
        //int arr[] = {1,3,-1,-3,5,3,6,7};
        int n = arr.length;
        int res[] = new int[n-k+1];
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i));

        }
        res[0] = pq.peek().val;

        for(int i=k;i<n;i++){
            while(pq.size()>0 && pq.peek().idx <= i-k){
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1] = pq.peek().val;
        }

        return res;
    }
}