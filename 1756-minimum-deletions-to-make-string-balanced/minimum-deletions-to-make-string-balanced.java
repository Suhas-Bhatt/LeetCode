class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> ss = new Stack<>();
        int n = s.length();
        int count=0;
        //Stack
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='b'){
                ss.push(ch);
            } else {
                //ch=='a'
                if(!ss.isEmpty()){
                    ss.pop();
                    count++;
                }
               
            }
        }

    return count;
    }
}