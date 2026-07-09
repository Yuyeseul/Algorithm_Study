import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> keys = Arrays.asList("code","date", "maximum", "remain");
        List<int[]> list = new ArrayList<>();
        
        int index = keys.indexOf(ext);
        int sort = keys.indexOf(sort_by);
        
        for(int i = 0; i < data.length; i++){
            if(data[i][index] < val_ext){
                list.add(data[i]);
            }
        }
        
        list.sort((a,b) -> a[sort] - b[sort]);
        
        int[][] answer = new int[list.size()][4];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
