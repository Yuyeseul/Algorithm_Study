import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                if(map.containsKey(key.charAt(i))){ 
                    if(map.get(key.charAt(i)) > i+1){
                        map.put(key.charAt(i), i+1);
                    }
                } else{
                    map.put(key.charAt(i), i+1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            String s = targets[i];
            for(int j = 0; j < s.length(); j++){
                if(map.containsKey(s.charAt(j))){
                    answer[i] += map.get(s.charAt(j));
                } else{
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
