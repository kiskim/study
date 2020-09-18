package exam._02_;

import java.util.ArrayList;

public class 기능개발 {

    public int[] solution(int[] progresses, int[] speeds) {
		int[] answer;
		int index = 0;
		int complete = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		while(index < progresses.length){
			complete = index;
			for(int i = 0; i < progresses.length; i++)
			{
				progresses[i] += speeds[i];
				if(progresses[i] >= 100 && i == index)
					index++;
			 }
			 if(index - complete > 0)
			 	list.add(index - complete);
		}
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++)
			answer[i] = list.get(i);

        return answer;
	}
	
	public static void main(String[] args) {
		int [] p = {93, 30, 55};
		int [] s = {1, 30, 5};
		int [] p2 = {95, 90, 99, 99, 80, 99};
		int [] s2 = {1, 1, 1, 1, 1, 1};
		기능개발 q = new 기능개발();
		for(int a: q.solution(p, s))
			System.out.print(a+" ");
		System.out.println();
		for(int a: q.solution(p2, s2))
			System.out.print(a+" ");
	}
}