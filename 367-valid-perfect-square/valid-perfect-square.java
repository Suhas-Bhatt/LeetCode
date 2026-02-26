class Solution {
    public boolean isPerfectSquare(int num) {
        double a =Math.sqrt(num);
        int b = (int) a;
        if(a==b){
            return true;
        }
        return false;
    }
}