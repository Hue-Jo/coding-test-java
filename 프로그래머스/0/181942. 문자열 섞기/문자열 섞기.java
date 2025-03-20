import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String str1, String str2) {
        
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : str1.toCharArray()) {
            q1.offer(c);
        }
        
        for(char c : str2.toCharArray()) {
            q2.offer(c);
        }
        
        while(!q1.isEmpty() && !q2.isEmpty()){
            sb.append(q1.poll());
            sb.append(q2.poll());
        }
        return sb.toString();
    }
}