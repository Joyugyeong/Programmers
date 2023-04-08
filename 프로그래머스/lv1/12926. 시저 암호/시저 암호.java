import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int num=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                answer += ' ';
                continue;
            }
            if(Character.isUpperCase(s.charAt(i))){
                num = s.charAt(i)+n;
                if(num > 90) num = 64 + (num - 90);
            }
            else{
                num = s.charAt(i)+n;
                if(num > 122) num = 96 + (num - 122);
            }
            answer += Character.toString((char)num);
        }
        return answer;
    }
}