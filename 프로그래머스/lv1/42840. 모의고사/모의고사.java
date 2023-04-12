import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int max =0;
        int cnt=0;
        int arr1[]= {1,2,3,4,5};
        int arr2[]= {2,1,2,3,2,4,2,5};
        int arr3[]= {3,3,1,1,2,2,4,4,5,5};
        for(int i=0;i<answers.length;i++){
            if(arr1[i%5]==answers[i]){answer[0]++;}
            if(arr2[i%8]==answers[i]){answer[1]++;}
            if(arr3[i%10]==answers[i]){answer[2]++;}
        }
        for(int i=0;i<3;i++){
            if( answer[i]>=max )
                max=answer[i];
        }

        for(int i=0;i<3;i++){
            if( answer[i]==max )
                cnt+=1;
        }
        int result[]= new int [cnt];
        cnt=0;
        for(int i=0;i<3;i++){
            if( answer[i]==max )
                result[cnt++]=i+1;
        }
        return result;
    }
}