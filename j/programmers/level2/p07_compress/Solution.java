package programmers.level2.p07_compress;

public class Solution {
    public int solution(String s) {
		int answer = s.length();
		/**
		 * 압축할 문자열 길이
		 * 길이가 s.length() / 2 이상이되면 압축이 불가능해진다.
		 */
		for(int n = 1; n <= s.length() / 2; n++)
		{
			// 압축한 문자열을 저장할 객체
			StringBuilder temp = new StringBuilder();
			for(int i = 0; i < s.length(); i+=n)
			{
				// 압축할 문자열 word
				String word = "";
				if(i + n >= s.length())
					word = s.substring(i, s.length());
				else
					word = s.substring(i, i + n);
				int cnt = 1;
				StringBuilder sb = new StringBuilder(); 
				// 압축할 문자열 자신의 위치 다음부터 확인
				for(int j = i+n; j <s.length(); j= j+n)
				{
					// 비교할 문자열 word2
					String word2= "";
					if(j+n >= s.length())
						word2 = s.substring(j, s.length());
					else
						word2 = s.substring(j, j+n);
					// 연속된 경우만 해당하기 때문에 같지 않으면 반복문 중단
					if(word.equals(word2)){
						cnt++;
						i = j;
					}
					else
						break;
				}
				// cnt가 1인경우는 압축되지 않은 경우로 문자열만 출력
				if(cnt == 1) sb.append(word);
				else sb.append(cnt).append(word);

				temp.append(sb.toString());
			}
			answer = Math.min(answer, temp.toString().length());
		}
        return answer; 
	}
	public static void main(String[] args) {
		String s = "aabbaccc";
		System.out.println(new Solution().solution(s));
	}
}
