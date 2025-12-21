class Solution {
    public String makeFancyString(String s) {
        if (s.length()<3){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));

        for(int i = 2; i<s.length();i++){
            char ch = s.charAt(i);
            int len = sb.length();

            if(ch==sb.charAt(len-1) && ch == sb.charAt(len-2)){
                continue;
            }

            sb.append(ch);


        }

        return sb.toString();
    }
}