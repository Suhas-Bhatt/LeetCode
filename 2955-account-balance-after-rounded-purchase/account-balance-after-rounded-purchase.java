class Solution {
    public int accountBalanceAfterPurchase(int p) {
        int a =100;
        if(p>=0 && p<5 ) return 100;
        if(p>=5 && p<15 ) return 100-10;
        if(p>=15 && p<25 ) return 100-20;
        if(p>=25 && p<35 ) return 100-30;
        if(p>=35 && p<45 ) return 100-40;
        if(p>=45 && p<55 ) return 100-50;
        if(p>=55 && p<65 ) return 100-60;
        if(p>=65 && p<75 ) return 100-70;
        if(p>=75 && p<85 ) return 100-80;
        if(p>=85 && p<95 ) return 100-90;
        if(p>=95 && p<=100 ) return 0;
        return -1;
    }
}