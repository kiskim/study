package programmers.level2.p01_function;

import java.util.ArrayList;

public class Solution {

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
	public int checkComplete(int [] progresses){
		int cnt = 0;
		for(int p : progresses){
			if(p >= 100)
				cnt++;
			else
				return cnt;
		}
		return cnt;
	}
    public int[] solution2(int[] progresses, int[] speeds) {
		int [] answer = null;
		int complete_cnt = 0;
		ArrayList<Integer> complete = new ArrayList<>();
		while(complete_cnt != progresses.length){
			int cnt = 0;
			for(int i = 0; i < progresses.length; i++)
				progresses[i] += speeds[i];
			if((cnt = checkComplete(progresses)) > 0 && cnt > complete_cnt){
				complete.add(cnt - complete_cnt);
				complete_cnt = cnt;
			}
		}
		answer = new int[complete.size()];
		for(int i = 0; i < complete.size(); i++)
			answer[i] = complete.get(i);
		return answer;
	}

	public static void main(String[] args) {
		int [] p = {93, 30, 55};
		int [] s = {1, 30, 5};
		int [] p2 = {95, 90, 99, 99, 80, 99};
		int [] s2 = {1, 1, 1, 1, 1, 1};
		Solution q = new Solution();
		for(int a: q.solution2(p, s))
			System.out.print(a+" ");
		System.out.println();
		for(int a: q.solution2(p2, s2))
			System.out.print(a+" ");
	}
}