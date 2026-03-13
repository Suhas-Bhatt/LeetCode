class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<n.length;i++){
            hm.put(h[i],n[i]);
        }
        Arrays.sort(h);
        String[] res = new String[h.length];
        int idx=0;
        for(int i=h.length-1;i>=0;i--){
            res[idx]=hm.get(h[i]);
            idx++;
        }
        return res;
    }
}