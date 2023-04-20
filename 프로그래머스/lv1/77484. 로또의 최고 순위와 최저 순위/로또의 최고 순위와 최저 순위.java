import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int count =0;
        int zero =0;
        for(int i=0;i<win_nums.length;i++){
            for(int j=0;j<lottos.length;j++){
                if(win_nums[i]==lottos[j]){
                    count++;
                }
            }
        }
        for(int j=0;j<lottos.length;j++){
                if(lottos[j]==0){
                    zero++;
                }
            }
        answer[0]=7-count-zero;
        if(answer[0]>5){answer[0]=6;}
        answer[1]=7-count;
        if(answer[1]>5){answer[1]=6;}
        return answer;
    }
}