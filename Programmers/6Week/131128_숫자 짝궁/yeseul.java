import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] Xcount = new int[10];
        int[] Ycount = new int[10];
        for(int i = 0; i < X.length(); i++){
            int x = Character.getNumericValue(X.charAt(i));
            Xcount[x]++;
        }
        for(int i = 0; i < Y.length(); i++){
            int y = Character.getNumericValue(Y.charAt(i));
            Ycount[y]++;
        }
        for(int i = 9; i >= 0; i--){
            int min = Math.min(Xcount[i],Ycount[i]);
            for(int j = 0; j < min; j++){
                answer.append(i);
            }
        }
        if(answer.length()==0){
            return "-1";
        }
        
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer.toString();
    }
}
