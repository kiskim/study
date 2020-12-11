package programmers.level2.p29_couple;

import java.util.ArrayList;
import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
		int i = 0;
		ArrayList<String> list = new ArrayList<String>();
		for(String str: s.split("")){
			list.add(str);
		}
		while(i < list.size() - 1 ){
			if(list.get(i).equals(list.get(i+1))){
				list.remove(i + 1);
				list.remove(i);
				i = 0;
			}
			else
				i++;
		}
        return list.size() == 0 ? 1 : 0;
	}

    public int solution2(String s)
    {
		int len = s.length();
		while(len > 0){
			s = s.replaceFirst("(.)\\1", "");
			if (s.length() == len)
				break;
			else
				len = s.length();
		}
		return s.length() == 0 ? 1 : 0;
	}

	public int solution3(String s){
		Stack<Character> stk = new Stack<>();
		for(char c: s.toCharArray()){
			if(!stk.empty() && stk.peek() == c)
				stk.pop();
			else
				stk.push(c);
		}
		return stk.size() == 0 ? 1 : 0;
	}

	public static void main(String[] args) {
		String s = "baaabaa";
		new Solution().solution2(s);
	}
}