import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        List<Integer> canAttend = new ArrayList<>();
        for(int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                canAttend.add(i);
            }
        }
        
        canAttend.sort(Comparator.comparingInt(a -> rank[a]));
        
        int a = canAttend.get(0);
        int b = canAttend.get(1);
        int c = canAttend.get(2);
        
        return 10000 * a + 100 * b + c;
        
    }
}