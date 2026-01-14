class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;
        for(int i = 1 ; i< points.length; i++){
            int x1 = points[i-1][0];
            int y1 = points[i-1][1];
            int x2 = points[i][0];
            int y2 = points[i][1];
            distance += Math.max(Math.abs(x2-x1),Math.abs(y2-y1));
        }



        return distance ;
    }
}