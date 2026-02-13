class Solution {
    public int differenceOfSums(int n, int m) {
        int sumA=0;
        int sumB=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                sumA+=i;
            } else {
                sumB+=i;
            }
        }

        return sumA-sumB;
    }
}