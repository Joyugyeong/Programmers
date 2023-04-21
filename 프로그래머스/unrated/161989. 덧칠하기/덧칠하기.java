class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int size = section.length;
        int next = section[0];
        int index=0;
        
        while(index<size){
            if(next<=section[index]){
                next = section[index] + m;
                answer++;
            }
            index++;
        }
        return answer;
    }
}