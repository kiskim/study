package programmers.level2.p42_maxValue;

import java.util.ArrayList;

class Solution {
	public static ArrayList<String> comb;

	public void getCase(char [] arr, int depth){
		if(depth == arr.length){
			comb.add(String.valueOf(arr));
			return;
		}
		for(int i = depth; i < 3; i++)
		{
			swap(arr, depth, i);
			getCase(arr, depth + 1);
			swap(arr, depth, i);
		}
	}
	public void swap(char [] arr, int depth, int i)
	{
		char temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}
    public long solution(String expression) {
		long answer = -1;
		ArrayList<Long> num = new ArrayList<Long>();
		ArrayList<String> syb = new ArrayList<>();
		comb = new ArrayList<>();
		for(String t: expression.split("[-*+]"))
			num.add(Long.parseLong(t));
		for(String t:  expression.split("[0-9]"))
			if(t.length() > 0)
				syb.add(t);
		getCase("-*+".toCharArray(), 0);
		for(String s: comb){
			ArrayList<Long> tmp_num = new ArrayList<>();
			ArrayList<String> tmp_syb = new ArrayList<>();
			tmp_num.addAll(num);
			tmp_syb.addAll(syb);
			long temp = 0;
			for(String c : s.split("")){
				int idx = 0;
				while(idx > -1){
					if((idx = tmp_syb.indexOf(c)) > -1){
						switch(c){
							case "+" : temp = tmp_num.get(idx) + tmp_num.get(idx + 1); break;
							case "-" : temp = tmp_num.get(idx) - tmp_num.get(idx + 1); break;
							case "*" : temp = tmp_num.get(idx) * tmp_num.get(idx + 1); break;
						}
						tmp_syb.remove(idx);
						tmp_num.set(idx, temp);
						tmp_num.remove(idx + 1);
					}
				}
			}
			answer = Math.max(answer, Math.abs(temp));
		}
        return answer;
	}
	
	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		new Solution().solution(expression);
	}
}