import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num=0;
        if((s.charAt(0))==')'){
                return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i))=='('){
                answer = false;
                num++;
            }
            if((s.charAt(i))==')'){
                answer = true;
                num--;
            }
            if(num<0){return false;}   
        }
        if(num!=0){answer= false;}
        return answer;
    }
}