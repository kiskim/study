package programmers.level2.p14_bracket;

public class Solution{
    public String solution(String p) {
		String answer = null;
		if (p.length() == 0)
			return "";
		StringBuilder sb = new StringBuilder(p);
		String u = sb.substring(0, getBalIdx(p) + 1);
		String v = sb.substring(getBalIdx(p) + 1);
		if (isRightStr(u) == true)
			return u + solution(v);
		else{
			sb = new StringBuilder("(");
			sb.append(solution(v));
			sb.append(')');
			if (u.length() > 2){
				for (int i = 1; i < u.length() - 1; i++){
					if (u.charAt(i) == '(')
						sb.append(')');
					else
						sb.append('(');
				}
			}
		}
		answer = sb.toString();
        return answer;
	}
	
	public int getBalIdx(String p){
		int idx = -1;
		int chk_right = 0;
		do{
			idx++;
			if (p.charAt(idx) == '(')
				chk_right++;
			else
				chk_right--;
		}while (chk_right != 0 && idx < p.length());
		return idx;
	}

	public boolean isRightStr(String s){
		int cnt = 0;
		for(int i = 0; i < s.length(); i++){
			if (s.charAt(i) == '(')
				cnt++;
			else
				cnt--;
			if (cnt < 0)
				break;
		}
		return cnt >= 0;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "()))((()";
		sol.solution(s);
	}
}