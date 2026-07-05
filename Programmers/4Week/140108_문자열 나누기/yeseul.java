class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = ' ';
        int sameCount = 0;
        int diffCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(sameCount==diffCount){
                answer++;
                x = s.charAt(i);
                sameCount = 1;
                diffCount = 0;
            } else {
                if(s.charAt(i) == x){
                    sameCount++;
                } else {
                    diffCount++;
                }
            }
        }
        return answer;
    }
}
