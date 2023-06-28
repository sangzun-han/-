import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for(long i=left; i<=right; i++,index++) {
            int x = (int)(i%n+1);
            int y = (int)(i/n+1);
            
            answer[index] = Math.max(x,y);
        }
        
        
        return answer;
    }
}