import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        int a = Integer.bitCount(n);
        while(true){
            num++;
            int b = Integer.bitCount(num);
            if(a==b){
                answer = num;
                break;
            }
            
        }
        return answer;
    }
}