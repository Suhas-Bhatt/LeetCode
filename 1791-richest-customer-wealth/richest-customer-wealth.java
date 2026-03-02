class Solution {
    public int maximumWealth(int[][] a) {
        int sum=0;
        int n=a.length;
        int m=a[0].length;
        for(int i=0;i<n;i++){
            int currSum =0;
            for(int j=0;j<m;j++){
                
                currSum += a[i][j];
                sum = Math.max(sum,currSum);
            }
        }
        return sum;
    }
}