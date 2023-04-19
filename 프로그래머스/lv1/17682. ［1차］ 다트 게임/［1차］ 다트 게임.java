import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int []dart = new int [3];
        int num =0; 
        int index=0;
        String str = "";
        for(int i=0;i<dartResult.length();i++){
            char c = dartResult.charAt(i);
            
            if(c>='0'&&c<='9'){
                str+=String.valueOf(c);
            }
            else if(c=='S'||c=='D'||c=='T'){
                num = Integer.parseInt(str);
                if(c=='S'){
                    dart[index++] = (int)Math.pow(num,1);
                }
                else if(c=='D'){
                    dart[index++] = (int)Math.pow(num,2);
                }
                else if(c=='T'){
                    dart[index++] = (int)Math.pow(num,3);
                }
                str="";
            }
            else
            {
                if(c=='*'){
                    dart[index-1]*=2;
                    if(index-2>=0) dart[index-2]*=2;
                }
                else{
                    dart[index-1]*=(-1);
                }
            }
        }
        answer=dart[0]+dart[1]+dart[2];
        return answer;
    }
}