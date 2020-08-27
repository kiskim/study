package programmers._01_hash;

import java.util.HashMap;

public class 위장 {
    public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String [] s : clothes)
			map.put(s[1], map.getOrDefault(s[1], 0)+1);
		for(String s : map.keySet())
			answer *= map.get(s) + 1;
        return answer - 1;
	}
	
	public static void main(String[] args) {
		String [][] s = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(s));
	}
}