import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int sum=0;
        String day[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int month [] = {30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(a==1){
            sum+=b-1;
            answer += day[sum%7];
        }
        else{
            for(int i=0;i<a-1;i++){
                sum+=month[i];
            }
            sum+=b;
            answer = day[sum%7];
        }
        return answer;
    }
}