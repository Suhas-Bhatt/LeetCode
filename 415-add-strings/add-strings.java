// class Solution {
//     public String addStrings(String num1, String num2) {
//         long a = Long.parseLong(num1);
//         long b = Long.parseLong(num2);
//         long c = a + b;
//         return String.valueOf(c);
//     }
// }

import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.add(b);
        return c.toString();
    }
}