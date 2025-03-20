class Solution {
    public int solution(int a, int b) {
        
        String x = String.valueOf(a);
        String y = String.valueOf(b);
        
        int i = Integer.valueOf(x+y);
        
        return Math.max(i, 2*a*b);
    }
}