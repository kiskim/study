package programmers.level2.p28_jadenCase;

class Solution {
    public String solution(String s) {
		String answer = "";
		String lower = s.toLowerCase();
		if(lower.charAt(0) >= 'a' && lower.charAt(0) <= 'z')
			answer += (char)(lower.charAt(0) - 32);
		else
			answer += (char)(lower.charAt(0));
		for(int i = 1; i < lower.length(); i++){
			if(lower.charAt(i - 1) == ' '
			&& (lower.charAt(i) >= 'a' && lower.charAt(i) <= 'z'))
				answer += (char)(lower.charAt(i) - 32);
			else
				answer += (char)(lower.charAt(i));
		}
        return answer;
	}

    public String solution2(String s) {
		String answer = "";
		String [] arr = s.toLowerCase().split("");
		boolean flag = true;
		for(String str : arr){
			answer += flag ? str.toUpperCase() : str;
			flag = str.equals(" ");
		}
		return answer;
	}
}