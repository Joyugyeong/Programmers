import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int [] arr= new int[speeds.length];
        for(int i=0;i<speeds.length;i++){
            while(progresses[i]<100){
                progresses[i]+=speeds[i];
                arr[i]+=1;
            }
        }
        ArrayList <Integer> list = new ArrayList<>();
        int release = 1;
        int cnt=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[cnt] < arr[i]) {
                list.add(release);
                cnt = i;
                release = 1;
                if (i + 1 == arr.length) list.add(release);

            } else {
                release += 1;
                if (i + 1 == arr.length) list.add(release);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        
        
        }
        return answer;
    }
}