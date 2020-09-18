package exam.exam_test;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class _03 {
	public class Applicant {
	}
    public int[] solution(String[] info, String[] query) {
		int[] answer = null;
		String temp = null;
		ArrayList<Integer> res = new ArrayList<Integer>();
		StringTokenizer st = null;
		int [][] list = new int[info.length][5];
		int [][] q_list = new int[query.length][5];
		for(int i = 0; i < info.length; i++)
		{
			st = new StringTokenizer(info[i], " ");
			int j = 0;
			while(st.hasMoreTokens()&& j < 5)
			{
				temp  = st.nextToken();
				switch(temp)
				{
					case "java" : list[i][j] = 0; break;
					case "python" : list[i][j] = 1; break;
					case "cpp" : list[i][j] = 2; break;
					case "backend" : list[i][j] = 0; break;
					case "frontend" : list[i][j] = 1; break;
					case "junior" : list[i][j] = 0; break;
					case "senior" : list[i][j] = 1; break;
					case "pizza" : list[i][j] = 0; break;
					case "chicken" : list[i][j] = 1; break;
					default : list[i][j] = Integer.parseInt(temp); break;
				}
				j++;
			}
		}		
		for(int i = 0; i < query.length; i++)
		{
			st = new StringTokenizer(query[i].replaceAll("and", ""), " ");
			int j = 0;
			while(st.hasMoreTokens() && j < 5)
			{
				temp  = st.nextToken();
				switch(temp)
				{
					case "java" : q_list[i][j] = 0; break;
					case "python" : q_list[i][j] = 1; break;
					case "cpp" : q_list[i][j] = 2; break;
					case "backend" : q_list[i][j] = 0; break;
					case "frontend" : q_list[i][j] = 1; break;
					case "junior" : q_list[i][j] = 0; break;
					case "senior" : q_list[i][j] = 1; break;
					case "pizza" : q_list[i][j] = 0; break;
					case "chicken" : q_list[i][j] = 1; break;
					case "-" : q_list[i][j] = -1; break;
					default : q_list[i][j] = Integer.parseInt(temp); break;
				}
				j++;
			}
		}
		for(int [] q : q_list)
		{
			int count = 0;
			for(int [] l : list)
			{
				boolean r = true;
				int i = 0;
				while(r && i < q.length)
				{
					if(q[i] == -1)
						r = true;
					else if(q[i] < 2)
						r = l[i] == q[i];
					else
						r = l[i] >= q[i];
					i++;
				}
				if(r == true)
					count++;
			}
			res.add(count);
		}
		answer = new int[res.size()];
		for(int i = 0; i < res.size(); i++)
			answer[i] = res.get(i);
        return answer;
	}
	
	public static void main(String[] args) {
		_03 test = new _03();
		String [] info =  {"java backend junior pizza 150",
						   "python frontend senior chicken 210",
						   "python frontend senior chicken 150",
						   "cpp backend senior pizza 260",
						   "java backend junior chicken 80",
						   "python backend senior chicken 50"};
		String [] query = {"java and backend and junior and pizza 100",
						   "python and frontend and senior and chicken 200",
						   "cpp and - and senior and pizza 250",
						   "- and backend and senior and - 150",
						   "- and - and - and chicken 100",
						   "- and - and - and - 150"};
		int [] res = test.solution(info, query);
		for(int r :  res)
			System.out.print(r+" ");

	}
}