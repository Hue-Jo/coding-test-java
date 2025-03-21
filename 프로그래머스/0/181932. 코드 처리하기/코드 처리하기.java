class Solution {
    public String solution(String code) {
        
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            
            if(mode == 0) {
                if (c == '1') {
                    mode = 1;
                } else {
                    if ( i % 2 ==0) {
                        ret.append(c);
                    }
                }
            } else {
                if (c == '1'){
                    mode = 0;
                } else {
                    if (i % 2 == 1 ){
                        ret.append(c);
                    }
                }
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
        
    }
}