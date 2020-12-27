package programmers.level2.p37_news;

import java.util.HashMap;

public class Solution {
    public int solution(String str1, String str2) {
		int answer = 0;
		int i = 0;
		float cnt = 0;
		float max = 0;
		HashMap<String, Integer> list1 = new HashMap<>();
		HashMap<String, Integer> list2 = new HashMap<>();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		while(i + 1< str1.length()){
			String temp = str1.substring(i, i + 2);
			if(temp.matches("^[a-z]*$"))
				list1.put(temp, list1.getOrDefault(temp, 0) + 1);
			i++;
		}
		i = 0;
		while(i + 1 < str2.length()){
			String temp = str2.substring(i, i + 2);
			if(temp.matches("^[a-z]*$"))
				list2.put(temp, list2.getOrDefault(temp, 0) + 1);
			i++;
		}
		if(list1.size() == 0 && list2.size() == 0)
			return 65536;
		for(String key : list2.keySet()){
			if(list1.containsKey(key)){
				cnt += Math.min(list1.get(key), list2.get(key));
				max += Math.max(list1.get(key), list2.get(key));
			}
			else
				max += list2.get(key);
		}
		for(String key: list1.keySet()){
			if(!list2.containsKey(key))
				max += list1.get(key);
		}

		answer = (int)((cnt / max) * 65536 );
        return answer;
	}
	
	public static void main(String[] args) {
		String str1 = "aa1+aa2";
		String str2 = "AAAA12";
		new Solution().solution(str1, str2);
	}
}
