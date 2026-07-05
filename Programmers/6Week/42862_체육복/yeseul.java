import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        List<Integer> list = new ArrayList<>();
        for(int r : reserve){
            list.add(r);
        }
        
        for (int i = 0; i < lost.length; i++) {
            if (list.contains(lost[i])) {
                answer++;
                list.remove(Integer.valueOf(lost[i]));
                lost[i] = -1;
            }
        }
        
        for(int i = 0; i < lost.length; i++){
            if(lost[i] == -1) continue;
            for(int j = 0; j < list.size(); j++){
                if(lost[i] - 1 == list.get(j)){
                    answer++;
                    list.remove(Integer.valueOf(lost[i] - 1));
                    break;
                } else if (lost[i] + 1 == list.get(j)){
                    answer++;
                    list.remove(Integer.valueOf(lost[i] + 1));
                    break;
                }
            }
        }
        return answer;
    }
}
