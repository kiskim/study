package programmers.level1.p22_itsMind;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public String[] solution(String[] strings, int n) {
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
