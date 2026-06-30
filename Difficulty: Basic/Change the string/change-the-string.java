class Solution {
    String modify(String s) {
        int n =s.length();
        if(65<=(int)s.charAt(0) && (int)s.charAt(0)<=92){
            return s.toUpperCase();
        }
        else return s.toLowerCase();
    }
}