package programmers._04_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Biggest {

	public int fNum(int n)
	{
		int res = 0;
		while (n >= 10)
			n /= 10;
		return res;
	}
    public String solution(int[] numbers) {
		String answer = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int a: numbers)
			list.add(a);
		Collections.sort(list, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return fNum(o1) - fNum(o2);
			}
			
		});
		for(int s : list)
			answer+=Integer.toString(s);
        return answer;
	}
	
	public static void main(String[] args) {
		
	}
}