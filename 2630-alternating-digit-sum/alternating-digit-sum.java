class Solution {
    public int alternateDigitSum(int n) {
       ArrayList<Integer> arr = new ArrayList<Integer>();
       while(n>0){
        int temp =  n % 10;
        arr.add(temp);
        n=n/10;
       }
       Collections.reverse(arr);

       int sum = 0;
       for(int i = 0 ; i<arr.size();i++){
        if(i%2==0){
            sum += arr.get(i);
        } else {
            sum -= arr.get(i);
        }
       }
       return sum;
    }
}