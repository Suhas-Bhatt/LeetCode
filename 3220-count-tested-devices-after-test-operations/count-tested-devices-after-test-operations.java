// class Solution {
//     public int countTestedDevices(int[] batteryPercentages) {
//         int n=batteryPercentages.length;
//         int tested=0;
//         for(int i=0;i<n;i++){
//             if(batteryPercentages[i]>0){
//                 tested++;
//                 for(int j=1+1;j<n;j++){
//                     batteryPercentages[j] = Math.max(0,batteryPercentages[j]-1);
//                 }
//             } else {
//                 continue;
//             }
//         }
//         return tested;
//     }
// }
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int n=batteryPercentages.length , tested =0;
        for(int i=0;i<n;i++){
            if(batteryPercentages[i]>0){
                tested++;
                for(int j=i+1;j<n;j++) batteryPercentages[j]=Math.max(0,batteryPercentages[j]-1);
            } else continue;
        }
        return tested;
        
    }
}