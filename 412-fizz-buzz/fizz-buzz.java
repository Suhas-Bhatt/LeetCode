class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output_arr = new ArrayList();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                output_arr.add("FizzBuzz");
            } else if(i%3==0){
                output_arr.add("Fizz");
            }else if(i%5==0){
                output_arr.add("Buzz");
            } else {
                output_arr.add(Integer.toString(i));
            }
        }

        return output_arr;
    }
}