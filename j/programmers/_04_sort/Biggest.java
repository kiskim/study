package programmers._04_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Biggest {
    public String solution(int[] numbers) {
		String answer = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int a: numbers)
			list.add(a);
		Collections.sort(list, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				int res = 0;
				int l1, l2;
				Stack<Integer> n1 = new Stack<Integer>();
				Stack<Integer> n2 = new Stack<Integer>();
				while(o1 >= 10)
				{
					n1.push(o1 % 10);
					o1 /= 10;
				}
				n1.push(o1 % 10);
				l1 = n1.peek();
				while(o2 >= 10)
				{
					n2.push(o2 % 10);
					o2 /= 10;
				}
				n2.push(o2 % 10);
				l2 = n2.peek();
				while(res == 0 && !(n1.empty() || n2.empty()))
					res = -(n1.pop() - n2.pop());
				if(res == 0 && (n1.empty() || n2.empty())){
					if(!n2.empty())
						res = n2.pop() > l1 ? 1 : -1;
					else if(!n1.empty())
						res = n1.pop() > l2 ? -1 : 1;
				}
				return res;
			}
			
		});
		for(int s : list)
			answer+=Integer.toString(s);
        return answer;
	}
    public String solution2(int[] numbers) {
		String answer = "";
		String [] list = new String[numbers.length];
		for(int i = 0; i < numbers.length; i++)
			list[i] = Integer.toString(numbers[i]);
		Arrays.sort(list, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return (o1+o2).compareTo(o2+o1);
			}
			
		});
		if(list[0].startsWith("0"))
			return "0";
		else
			for(String s: list)
				answer += s;
		return answer;
	} 
	public static void main(String[] args) {
		Biggest Big = new Biggest();
		int [] num = {31, 311};
		int [] num2 = {3, 30, 34, 5, 9};
		System.out.println(Big.solution(num));
		System.out.println(Big.solution(num2));
	}
}