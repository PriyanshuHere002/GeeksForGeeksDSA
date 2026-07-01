class Solution {
    public static int sumSubstrings(String s) {
        int sum =0,n=s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                sum = sum+Integer.parseInt(s.substring(i, j));
                
            }
        }
        return sum;
        
    }
}