class Solution {
    public static boolean isPowerofTwo(int n) {
        int m=n-1,result;
        if(n==0) return false;
        result=n & m;
        if(result==0) return true;
        else return false;
        
        
    }
}