import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        int index =0;
        if (s.length()==0){
            return 0;
        }

        stack.push(s.charAt(index++));
        while(index<s.length()){
            char c = s.charAt(index++);
            if(!stack.isEmpty()&&stack.peek()==c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty()?1:0;
    }
}