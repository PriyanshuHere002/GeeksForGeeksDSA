class Solution {
    public static int gcd(int a, int b) {
        if(a%b==0) return b;
        if(b%a==0) return a;
        return gcd(b%a,a);
        
    }
}
