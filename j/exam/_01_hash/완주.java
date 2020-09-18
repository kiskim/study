package exam._01_hash;

import java.util.Arrays;
import java.util.HashMap;

public class 완주 {

    public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i = 0;
		for(i = 0; i < completion.length; i++)
			if(!participant[i].equals(completion[i]))
				break;
		return participant[i];
	}
	
    public static String solution2(String[] participant, String[] completion) {
		String res = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String s : participant)
			map.put(s, map.getOrDefault(s, 0)+1);
		for(String s : completion)
			map.put(s, map.get(s) - 1);
		for(String s: map.keySet())
		{
			if(map.get(s) != 0)
			{
				res = s;
				break;
			}
		}
		return res;
	}
	public static void main(final String[] args) {
		final String [] p = {"leo", "kiki", "eden"};
		final String [] c = {"kiki", "eden"};
		System.out.print(solution(p, c));
	}
}