import java.util.*;
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num = common.length;
        for(int i=0;i<num-1;i++){
            if(common[i+1]-common[i]==common[i+2]-common[i+1]){
                answer = common[num-1]+(common[i+1]-common[i]);
                break;
            }
            else if(common[i+1]/common[i]==common[i+2]/common[i+1]){
                answer = common[num-1]*(common[i+1]/common[i]);
                break;
            }
        }
        return answer;
    }
}