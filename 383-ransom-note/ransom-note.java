class Solution{
    public boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(hm.containsKey(magazine.charAt(i))){
                hm.put(magazine.charAt(i),hm.get(magazine.charAt(i))+1);
            }else{
                hm.put(magazine.charAt(i),1);
            }
        }
        int count=0;
        for(char ch:ransomNote.toCharArray()){
            if(hm.containsKey(ch) && hm.get(ch)>0){
            count++;
            hm.put(ch,hm.get(ch)-1);
            } else {
                break;
            }
        }





    if(count == ransomNote.length()) return true;
    return false;
    }
}