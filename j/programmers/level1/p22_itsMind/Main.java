package programmers.level1.p22_itsMind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	class DataList implements Comparable<DataList>{
		String s;
		int n;
		public DataList(String s, int n)
		{
			this.s = s;
			this.n = n;
		}

		@Override
		public int compareTo(DataList o) {
			if(this.s.charAt(n) - o.s.charAt(n) != 0)
				return this.s.charAt(n) - o.s.charAt(n);
			else
			{
				return this.s.compareTo(o.s);
			}
		}
	}
    public String[] solution(String[] strings, int n) {
		String []  answer = null;
		ArrayList<DataList> list  = new ArrayList<>();
		for(String s : strings)
			list.add(new DataList(s, n));
		Collections.sort(list);
		answer  = new String[list.size()];
		for(int i = 0; i < list.size(); i++)
			answer[i] = list.get(i).s;
        return answer;
	}
    public String[] solution2(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(n) - o2.charAt(n) == 0)
					return o1.compareTo(o2);
				else
					return o1.charAt(n) - o2.charAt(n);
			}
		});
		return strings;
	}

	
	public static void main(String[] args) {
		Main m = new Main();
		String []  s = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		m.solution(s, 1);
		System.out.println(s[0].substring(1));
	}
}
