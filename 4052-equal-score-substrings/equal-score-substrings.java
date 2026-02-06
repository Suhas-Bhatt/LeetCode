class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        for (int i = 0; i < n; i++) {
            int val = (s.charAt(i) - 'a') + 1;
            prefix[i] = (i == 0 ? val : prefix[i - 1] + val);
        }

        for (int i = n - 1; i >= 0; i--) {
            int val = (s.charAt(i) - 'a') + 1;
            suffix[i] = (i == n - 1 ? val : suffix[i + 1] + val);
        }

        for (int i = 0; i < n - 1; i++) {
            if (prefix[i] == suffix[i + 1]) 
                return true;
        }

        return false;
    }
}