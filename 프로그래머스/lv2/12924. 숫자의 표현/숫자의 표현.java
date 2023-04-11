class Solution {
    public int solution(int n) {
        int answer =0;

        for(int i=1;i<=n;i++){
            int inum=i;
            int sum = 0;
            while (true){
                sum += inum;

                if(sum==n){
                    answer++;
                    break;
                }else if(sum>n){
                    break;
                }
                inum++;
            }
        }
        return answer;
    }
}