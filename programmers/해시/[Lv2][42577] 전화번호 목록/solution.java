import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String num : phone_book) {
            map.put(num, 1);
        }
        
        for (String num : phone_book) {
            for (int j = 1; j < num.length(); j++) {
                String prefix = num.substring(0, j);
                if (map.containsKey(prefix)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}