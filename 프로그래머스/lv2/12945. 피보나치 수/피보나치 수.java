import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i=2;i<=n;i++){
            list.add((list.get(i-1)+list.get(i-2))%1234567);
        }
        int num = list.get(list.size()-1);
        answer = num%1234567;
        
        return answer;
    }
}