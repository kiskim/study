package programmers.level2.p30_english;

class Solution {
	public boolean scanArr(String []words, String s, int idx){
		for(int i = 0; i < idx; i++){
			if(s.equals(words[i]))
				return true;
		}
		return false;
	}
	public boolean isConnect(String s1, String s2){
		if(s1.charAt(s1.length() - 1) == s2.charAt(0))
			return true;
		return false;
	}
    public int[] solution(int n, String[] words) {
		int [] answer = {0, 0};
		for(int i = 1; i < words.length; i++){
			if (!isConnect(words[i - 1], words[i]) || scanArr(words, words[i], i)){
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				break;
			}
		}
        return answer;
	}
	public static void main(String[] args) {
		String [] words = {"land", "dream", "mom", "mom", "ror"};
		new Solution().solution(2, words);
	}
}
