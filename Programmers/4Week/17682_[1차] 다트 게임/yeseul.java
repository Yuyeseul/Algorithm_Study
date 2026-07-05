import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        Pattern pattern = Pattern.compile("([0-9]+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);
        
        int[] scores = new int[3];
        int idx = 0;
        
        while(matcher.find()){
            String score = matcher.group(1);
            String bonus = matcher.group(2);
            String option = matcher.group(3);
            
            int result = Integer.parseInt(score);
            
            if(bonus.equals("S")){
                result = (int)Math.pow(result, 1);
            } else if(bonus.equals("D")){
                result = (int)Math.pow(result, 2);
            } else if(bonus.equals("T")){
                result = (int)Math.pow(result, 3);
            }
            
            if(option.equals("*")){
                result *= 2;
                if(idx > 0){
                    scores[idx-1] *= 2;
                }
            } else if(option.equals("#")){
                result *= -1;
            }
            
            scores[idx++] = result;
        }
        
        for(int s : scores){
            answer += s;
        }
        
        return answer;
    }
}
