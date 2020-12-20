package programmers.level2.p32_bigNumber;

class Solution {
	public int getDigit(int n){
		int cnt = 0;
		while(n > 1){
			cnt += n % 2;
			n = n >>1;
		}
		cnt += n;
		return cnt;
	}
    public int solution(int n) {
		int answer = n;
		int input_cnt = getDigit(n);
		int res_cnt = 0;
		do{
			answer++;
			res_cnt = getDigit(answer);
		}while(input_cnt != res_cnt);
        return answer;
	}
	
	public static void main(String[] args) {
		new Solution().solution(3);
	}
}