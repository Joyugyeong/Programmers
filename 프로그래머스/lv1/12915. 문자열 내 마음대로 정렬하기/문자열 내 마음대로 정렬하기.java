import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Comparator <String> cmp = new Comparator<>(){
            public int compare(String s1,String s2){
                char str1 = s1.charAt(n);
                char str2 = s2.charAt(n);
                
                if(str1>str2)
                    return 1;
                else if(str1<str2)
                    return -1;
                else 
                    return 0;
            }
        };
        Arrays.sort(strings);
        Arrays.sort(strings,cmp);
        for(int i = 0; i < strings.length; i++)
          answer[i] = strings[i];
        return answer;
    }
}