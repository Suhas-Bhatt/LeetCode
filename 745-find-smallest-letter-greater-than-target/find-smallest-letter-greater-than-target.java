class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int l=0;
        int r=n-1;

        while(l<=r){
            int m=l+(r-l)/2;
            if(letters[m]<=target){
                l=m+1;
            } else{
                r=m-1;
            }
        }

        return l<n ? letters[l]:letters[0];
    }
}