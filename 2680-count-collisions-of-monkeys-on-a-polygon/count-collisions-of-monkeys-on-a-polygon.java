class Solution {
    public int monkeyMove(int n) {
        long res =1;
        long k=2;
        long mod = (long)1e9+7;
        while(n>0){
            if(n%2==1) res=(res*k)%mod;
            k= (k*k)%mod;
            n>>=1;
        }
        return (int) ((res-2+mod)%mod);
    }
}