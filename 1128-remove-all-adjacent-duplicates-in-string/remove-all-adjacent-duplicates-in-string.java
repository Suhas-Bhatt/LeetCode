import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ss = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ss.isEmpty()){
                ss.push(ch);
            } else if(ss.peek()==ch) {
                ss.pop();
            } else {
                ss.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!ss.isEmpty()){
            sb.append(ss.pop());
        }

        return sb.reverse().toString();
        
    }
}