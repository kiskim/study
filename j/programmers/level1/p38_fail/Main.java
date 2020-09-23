package programmers.level1.p38_fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public class Fail{
		int stage;
		double fail;
		public Fail(int stage, double fail)
		{
			this.stage = stage;
			this.fail = fail;
		}
	}
    public int[] solution(int N, int[] stages) {
		int[] answer;
		double count = stages.length;
		int j = 0;
		ArrayList<Fail> list = new ArrayList<>();
		Arrays.sort(stages);
		for(int i = 1; i < N+1; i++){
			list.add(new Fail(i, 0));
			while(j < stages.length && stages[j] == i){
				list.get(i-1).fail++;
				j++;
			}
			double temp = list.get(i-1).fail;
			list.get(i-1).fail = temp / count;
			count -= temp;
		}
		Collections.sort(list, new Comparator<Fail>(){

			@Override
			public int compare(Fail o1, Fail o2) {
				int res = 0;
				if(o1.fail - o2.fail > 0)
					res = -1;
				else if(o1.fail - o2.fail < 0)
					res = 1;
				return res;
			}
			
		});
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++)
		{
			answer[i] = list.get(i).stage; 
		}
        return answer;
	}
	public static void main(String[] args) {
		int [] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		Main m = new Main();
		int [] res = m.solution(5, stages);
		for(int a : res)
			System.out.print(a+" ");
	}
}
