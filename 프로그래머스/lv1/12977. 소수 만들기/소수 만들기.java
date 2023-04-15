import java.util.*;
class Solution {
    private boolean[] prime = new boolean[3001];
    public int solution(int[] nums) {
        int answer = 0;
        setPrimeArr();
        for(int i=0;i<nums.length-2;i++)
            for(int j=i+1;j<nums.length-1;j++)
                for(int k=j+1;k<nums.length;k++)
                    if(!prime[nums[i]+nums[j]+nums[k]])
                        answer++;

        return answer;
    }
    private void setPrimeArr(){
        for(int i=2; i*i <=3000;i++){
            for(int j=i;i*j<=3000 ; j++){
                prime[i*j]=true;
            }
        }
    }
}