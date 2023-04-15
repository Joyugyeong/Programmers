import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int box[] = new int [score.length/m];
        int index=0;
        int min =10;
        
        for(int i=score.length-1;i>=m-1;i-=m){
            for(int j=i;j>i-m;j--){
                min = Math.min(min, score[j]);
            }
            box[index++] = min *m;
        }
        
        return Arrays.stream(box).sum();
    }
}