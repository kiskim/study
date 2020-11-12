package exam.exam_test7;

public class Solution5 {
    public String solution(String penter, String pexit, String pescape, String data) {
		int len = penter.length();
		StringBuilder res = new StringBuilder("");
		res.append(penter);
		for(int i = 0; i < data.length(); i += len){
			String check = data.substring(i, i + len);
			if (i + len == data.length()){
				check = data.substring(i);
			}
			if (check.equals(penter) || check.equals(pexit) || check.equals(pescape))
				res.append(pescape);
			res.append(check);
		}
		res.append(pexit);
        return res.toString();
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String penter = "1100";
		String pexit = "0010";
		String pescape = "1001";
		String data = "1101100100101111001111000000";
		s.solution(penter, pexit, pescape, data);
	}
}

