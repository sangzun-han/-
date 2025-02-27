class Solution {
    public int solution(String s) {
        int answer = 1;
        
        for(int i=0; i<s.length(); i++) {
            answer = Math.max(answer, check(s, i,i));
            answer = Math.max(answer, check(s,i,i+1));
        }

        return answer;
    }
    
    public int check(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;
        
    }
}