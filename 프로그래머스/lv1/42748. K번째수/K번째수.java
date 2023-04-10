import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        for(int i=0;i<commands.length;i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int arr[] = new int [end-start+1];
            for(int j = 0;j<=end-start;j++){
                arr[j] = array[start+j-1];
            }
            Arrays.sort(arr);
            
            answer[i] = arr[commands[i][2]-1];
            
        }
        return answer;
    }
}