package programmers.level2.p36_predict;

class Solution
{
    public int solution(int n, int a, int b)
    {
		int answer = 0;
		int num = 1;
		while(a != b){
			answer++;
			for(int i = 1; i < n; i += 2){
				if(a >= i && a <= i + 1){
					a = num;
				}
				if(b >= i && b <= i + 1){
					b = num;
				}
				num++;
			}
			n = n / 2;
			num=1;
		}
        return answer;
	}
	public static void main(String[] args) {
		new Solution().solution(8, 4, 7);
	}
}