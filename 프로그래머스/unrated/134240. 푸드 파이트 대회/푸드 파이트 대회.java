import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        String s ="";
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                s+=i;
            }
        }
        answer =s+"0";
        StringBuffer sb = new StringBuffer(s);
        answer += sb.reverse().toString();
        
        return answer;
    }
}