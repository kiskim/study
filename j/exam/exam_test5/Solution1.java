package exam.exam_test5;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution1 {
    public String solution(int n, int[][] delivery) {
		String answer = "";
		HashMap<Integer, Integer> res = new HashMap<Integer, Integer>();
		ArrayList<int[]> list = new ArrayList<int[]>();
		int checkIdx = 0;

		for (int [] d : delivery)
			list.add(d);
		while (checkIdx < list.size())
		{
			if (list.get(checkIdx)[2] == 1)
			{
				res.put(list.get(checkIdx)[0], 1);
				res.put(list.get(checkIdx)[1], 1);
				list.remove(checkIdx);
			}
			else
				checkIdx++;
		}
		checkIdx = 0;
		while(checkIdx < list.size())
		{
			if(res.containsKey(list.get(checkIdx)[0]) && res.get(list.get(checkIdx)[0]) == 1){
				res.put(list.get(checkIdx)[1], -1);
				list.remove(checkIdx);
			}
			else if(res.containsKey(list.get(checkIdx)[1])&& res.get(list.get(checkIdx)[1]) == 1){
				res.put(list.get(checkIdx)[0], -1);
				list.remove(checkIdx);
			}
			else
				checkIdx++;
		}
		for(int i = 1; i <= n; i++)
		{
			if(res.containsKey(i))
			{
				answer += res.get(i) == 1 ? "O":"X";
			}
			else
				answer+= "?";
		}
        return answer;
	}	
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int n = 6;
		int [][] del = {{1,3,1},{3,5,0},{5,4,0},{2,5,0}};
		s.solution(n, del);
	}
}

