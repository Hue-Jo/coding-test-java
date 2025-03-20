class Solution {
    public int solution(int a, int b) {
        
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        int x = Integer.valueOf(str1 + str2);
        int y = Integer.valueOf(str2 + str1);
        
        return Math.max(x, y);
    }
}