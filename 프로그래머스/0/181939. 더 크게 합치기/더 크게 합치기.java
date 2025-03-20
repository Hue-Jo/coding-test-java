class Solution {
    public int solution(int a, int b) {
        
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        
        int x = Integer.valueOf(str1);
        int y = Integer.valueOf(str2);
        
        if (y > x) {
            return y;
        } else {
            return x;
        }
    }
}