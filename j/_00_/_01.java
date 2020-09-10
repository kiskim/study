package _00_;

import java.util.ArrayList;

public class _01 {
	public int solution(String s)
	{
		int answer = 0;
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0; i < s.length(); i++)
		{
			switch(s.charAt(i))
			{
				case '(': 
				case '{': 
				case '[': 
				case '<': 
					list.add(s.charAt(i));
				break;
				case ')':  
					if(list.contains('(')){
						list.remove(list.indexOf('('));
						answer++;
					}
					else
						return -1;
				break;
				case '}':
				case ']':
				case '>':
					if(list.contains((char)(s.charAt(i) - 2))){
						list.remove(list.indexOf((char)(s.charAt(i) - 2)));
						answer++;
					}
					else
						return -1;
				break;
			}
		}
		if(!list.isEmpty())
			return -1;
		return answer;
	}

	public static void main(String[] args) {
		String []s = {"Hello, world!", "if (Count of eggs is 4.) {Buy milk.}", "line [plus]",  ">_<"};
		_01 t = new _01();
		for(String a: s)
		{
			System.out.println(a+" - "+t.solution(a));
		}
		
	}
}
