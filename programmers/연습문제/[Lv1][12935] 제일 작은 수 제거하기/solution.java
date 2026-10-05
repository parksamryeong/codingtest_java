class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length <= 1){
            return new int[]{-1};
        }
        
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        int index = 0;
        
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != min){
                answer[index] = arr[j];
                index++;
            }
        }
        
        return answer;
    }
}