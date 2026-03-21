class Solution {
    public String truncateSentence(String s, int k) {
        String[] ss = s.split(" ");
        StringBuilder res  = new StringBuilder();
        for(int i=0;i<k;i++){
            res.append(ss[i]);
            if(i!=k-1){
                res.append(" ");
            }
        } 
        return  res.toString();
    }
}