class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        
        if(arr.length <= 1){
            return new int[]{-1};
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != min){
                answer[j] = arr[j];
            }
        }
        
        return answer;
    }
}