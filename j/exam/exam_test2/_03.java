package exam.exam_test2;

public class _03 {
    public int[] solution(int n) {
		int[] answer = new int[2];
		int index = 0;
		int count = 0;
		String s = Integer.toString(n);
		while(s.length() >=2)
		{
			if(s.length() > 2){
				index = s.length() / 2;
				while((s.substring(0, index+1).charAt(0) == '0' || s.substring(index+1, s.length()).charAt(0) == '0' ) && index < s.length())
					index++;
				s = Integer.toString(Integer.parseInt(s.substring(0, index+1)) + Integer.parseInt(s.substring(index+1, s.length())));
			}
			else{
				s = Integer.toString(Integer.parseInt(s) / 10 + Integer.parseInt(s) % 10);
			}
			count++;
		}
		answer[0] = count;
		answer[1] = Integer.parseInt(s);
        return answer;
	}
	public static void main(String[] args) {
		_03 test = new _03();
		test.solution(10007);
	}
}
