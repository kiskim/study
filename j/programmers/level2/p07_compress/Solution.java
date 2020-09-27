package programmers.level2.p07_compress;

public class Solution {
    public int solution(String s) {
		int answer = 0;
		StringBuffer sb = new StringBuffer(s);
		for(int lastIdx = 0; lastIdx <= s.length(); lastIdx++){
			for(int strIdx = 0; strIdx + lastIdx <= s.length(); strIdx++ )
			{
				String search = sb.subSequence(strIdx, strIdx + lastIdx).toString();
			}
		}
        return answer;
    }
}
