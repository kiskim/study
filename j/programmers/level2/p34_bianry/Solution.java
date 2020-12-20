package programmers.level2.p34_bianry;

public class Solution {
	public String getBianry(int n){
		if(n == 0)
			return "";
		else
			return getBianry(n>>1)+(n % 2);
	}
	public int cntZero(String s){
		int cnt = 0;
		for(char c : s.toCharArray()){
			if(c == '0')
				cnt++;
		}
		return cnt;
	}
	public int[] solution(String s) {
		int cnt = 0;
		int zeroCnt = 0;
		while(!s.equals("1")){
			cnt++;
			zeroCnt += cntZero(s);
			s = getBianry(s.replace("0", "").length());
		}
		
		int[] answer = {cnt, zeroCnt};
        return answer;
	}
	public static void main(String[] args) {
		new Solution().solution("110010101001");
	}
}
