package programmers._03_heap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class doubleQueue {
	public int[] solution(String[] operations) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(String s : operations)
		{
			StringTokenizer st = new StringTokenizer(s, " ");
			switch(st.nextToken())
			{
				case "D" : 
					switch(st.nextToken())
					{
						case "1" :  list.pollLast();  break;
						case "-1" : list.pollFirst(); break;
					}
					break;
				case "I" : 
					list.add(Integer.parseInt(st.nextToken()));
					Collections.sort(list);
					break;
			}
		}
		int [] answer = new int[2];
		int a = 0, b = 0;
		if(!list.isEmpty())
		{
			b = list.pollFirst();
			a = list.pollLast();
		}
		answer[0] = a;
		answer[1] = b;
		return answer;
	}
	
	public static void main(String[] args) {
		doubleQueue D = new doubleQueue();
		String [] s = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		D.solution(s);
	}
}
