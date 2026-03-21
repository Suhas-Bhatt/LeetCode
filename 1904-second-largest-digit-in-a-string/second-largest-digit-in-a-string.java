class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                set.add(Character.getNumericValue(ch));
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(list.size()<2) return -1;
        int res = list.get(list.size()-2);
        return res;
    }
}