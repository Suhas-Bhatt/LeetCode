class Solution {
    public boolean isSubsequence(String s, String t) {
        // int count = 0 ;
        // for(int i=0;i<s.length();i++){
        //     for(int j=0;j<t.length();j++){
        //         if(s.charAt(i)==t.charAt(j)){
        //             count++;
        //         }
        //     }
        // }
        // if(count==s.length()) return true;
        // return false;
        int i = 0;
        int j = 0;
        
        while( i<s.length() && j<t.length() ){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i == s.length()) return true;
        return false;
    }
}