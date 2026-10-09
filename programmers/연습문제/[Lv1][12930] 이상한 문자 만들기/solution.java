class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ",-1);
        
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                
                String w = String.valueOf(words[i].charAt(j));
                
                if(j % 2 == 0){
                    answer += w.toUpperCase();
                }else{
                    answer += w.toLowerCase();
                }
            }
            
            if(i < words.length -1){
                    answer += " ";
                } 
        }
        
        return answer;
    }
}