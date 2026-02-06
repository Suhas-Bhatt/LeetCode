class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(sum(i)%2==0){
                count ++;
            }
        }
        return count;
    }
    private int sum(int n){
        int s=0;
        while(n!=0){
            int digit = n%10;
            s += digit;
            n /=10;
        }
        return s;
    }
}