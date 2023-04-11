import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        String result ="";
        int cnt =0;
        while(true){
            int count =0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    count++;
                }
            }
            answer[1] += count;
            int num = s.length()-count;
            result = Integer.toBinaryString(num);
            s=result;
            System.out.print(result);
            cnt++;
            if(result.equals("1")){
                break;
            }
        }
        answer[0]=cnt;
        return answer;
    }
}