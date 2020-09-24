package programmers.level2.p03_printer;

import java.util.ArrayList;

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
	
	public static void main(String[] args) {
		int [] priority = {1, 1, 9, 1, 1, 1};
		Printer p = new Printer();
		int a = p.solution(priority, 0);
		System.out.println(a+"");
	}
	
}