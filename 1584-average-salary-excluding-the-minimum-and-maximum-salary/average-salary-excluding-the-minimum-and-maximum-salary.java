class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double avg;
        int n = salary.length-2;
        long sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum += salary[i];
        }
        avg = (double)sum/n;
        return avg;
    }
}