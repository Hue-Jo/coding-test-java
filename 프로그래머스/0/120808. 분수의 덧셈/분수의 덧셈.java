class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int top =  numer1 * denom2 + numer2 * denom1;
        int bottom = denom1 * denom2;
        
        int gcd = gcd(top, bottom);
        
        top /= gcd;
        bottom /= gcd;
        
        return new int[]{top, bottom};
    }
    
    // 최대 공약수 
     public int gcd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
           
}
