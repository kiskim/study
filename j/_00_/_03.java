package _00_;

import java.util.ArrayList;

public class _03 {
	public static class Road{
		char flag;
		int length;
		public Road(char flag, int len){
			this.flag = flag;
			this.length = len;
		}

		@Override
		public String toString() {
			return flag+" "+length;
		}
	}
	public static int solution(String road, int n)
	{
		int answer = 0;
		int count = 0;
		int len = 0;
		char pre = '2';
		ArrayList<Road> list = new ArrayList<Road>();
		for(char c : road.toCharArray())
		{
			if(pre == '2'){
				pre = c;
				count++;
			}
			else if(pre == c)
			{
				count++;
			}
			else if(pre != c)
			{
				list.add(new Road(pre, count));
				count = 1;
				pre = c;
			}
		}
		if(list.get(list.size() - 1).flag != pre)
			list.add(new Road(pre, count));
		int j = 0;
		for(int i = 0; i < list.size(); i++)
		{
			j = i;
			len = 0;
			count = 0;
			while(count < n && j < list.size())
			{
				Road r = list.get(j);
				len += r.length;
				if(r.flag == '0')
					count += r.length;
				j++;
			}
			if(i > 0 && list.get(i - 1).flag == '1')
				len += list.get(j - 1).length;
			if(j < list.size() && list.get(j).flag == '1')
				len += list.get(j).length;
			if(count <= n)
				answer = Math.max(answer, len);
		}
		return answer;
	}

    public static void main(String[] args) {
        String s1 = "111011110011111011111100011111";
        String s2 = "001100";
        int n1 = 3;
        int n2 = 5;
        System.out.println(solution(s1,n1)); //18
        System.out.println(solution(s2,n2)); //6
    }
}
