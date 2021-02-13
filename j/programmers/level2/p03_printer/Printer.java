package programmers.level2.p03_printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	public class Print{
		boolean flag;
		int priority;
		Print(int priority, boolean flag){
			this.priority = priority;
			this.flag = flag;
		}

	}
	public int solution(int[] priorities, int location) {
		int answer = 0;
		ArrayList<Print> list = new ArrayList<Print>();
		for(int i = 0; i < priorities.length; i++)
			list.add(new Print(priorities[i], location == i));
		int i = 0;
		for(i = 0; i < priorities.length;i++)
		{
			for(int j = i+1; j < priorities.length; j++)
			{
				if(list.get(i).priority < list.get(j).priority)
				{
					list.add(list.get(i));
					list.remove(i);
					i = -1;
					break;
				}
			}
		}
		for(Print a: list)
		{
			answer++;
			if(a.flag == true)
				break;	
		}
        return answer;
	}

	public int solution2(int[] priorities, int location){
		int answer = 0;
		int l = location;
		int size = priorities.length - 1;

		Queue<Integer> que = new LinkedList<>();
		for(int i : priorities)
			que.add(i);
		Arrays.sort(priorities);
		while(!que.isEmpty()){
			Integer i = que.poll();
			if(i == priorities[size - answer]){
				answer++;
				l--;
				if(l < 0)
					break;
			}
			else{
				que.add(i);
				l--;
				if(l < 0)
					l = que.size() - 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int [] priority = {2, 1, 3, 2};
		Printer p = new Printer();
		int a = p.solution2(priority, 1);
		System.out.println(a+"");
	}
	
}