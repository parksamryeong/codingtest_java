class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()){
            char code = c;
            int count = 0;
            
            while (count < index) {
                code++;
                if (code > 'z') code = 'a';

                if (skip.indexOf(code) == -1) {
                    count++;
                }
            }
            answer.append(code);
        }
        
        return answer.toString();
    }
}