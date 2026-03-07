class Solution {
    public long countSubstrings(String s, char c) {
        int[] count = new int[26];
        for(char ch: s.toCharArray()){
            count[ch-'a']++;
        }
        long k = count[c-'a'];
        long res = k*(k+1)/2;
        return res;
    }
}