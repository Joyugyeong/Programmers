import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int [][] arr = new int [sizes.length][2];
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                arr[i][0]=sizes[i][1];
                arr[i][1]=sizes[i][0];
            }
            else{
                arr[i][0]=sizes[i][0];
                arr[i][1]=sizes[i][1];
            }
        }
        int a=arr[0][0];
        int b=arr[0][1];
        for(int i=1;i<sizes.length;i++){
            if(a<arr[i][0]){a=arr[i][0];}
            if(b<arr[i][1]){b=arr[i][1];}
            // System.out.println(a);
            // System.out.println(b);
        }
        answer = a*b;
        return answer;
    }
}