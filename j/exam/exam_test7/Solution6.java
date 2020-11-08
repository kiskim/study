package exam.exam7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution6 {
    public String[] solution(String[] logs) {
		String[] answer = null;
		ArrayList<String> res = new ArrayList<>();
		HashMap<String, HashMap<String, String>> list = new HashMap<>();
		for(String log : logs)
		{
			String [] info = log.split(" ");
			if (!list.containsKey(info[1]))
				list.put(info[1], new HashMap<>());
			if (list.get(info[1]).containsKey(info[2])){
				if (!res.contains(info[0]))
					res.add(info[0]);
				if (!res.contains(list.get(info[1]).get(info[2])))
					res.add(list.get(info[1]).get(info[2]));
			}
			else
				list.get(info[1]).put(info[2], info[0]);
		}
		Collections.sort(res);
		answer = new String[res.size()];
		for (int i = 0; i < res.size(); i++)
			answer[i] = res.get(i);
        return answer;
	}
	public static void main(String[] args) {
		String []s = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
		new Solution6().solution(s);
	}
}
