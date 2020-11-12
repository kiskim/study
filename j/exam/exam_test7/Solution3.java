package exam.exam_test7;

public class Solution3 {
    public int solution(int money, String[] expected, String[] actual) {
		int answer = money;
		int bat = 100;
		for (int i = 0;  i < expected.length; i++)
		{
			if (expected[i].equals(actual[i]))
			{
				answer += bat;
				bat = 100;
			}
			else
			{
				answer -= bat;
				bat += bat;
				if (bat > answer)
					bat = answer;
			}
			if (answer == 0)
				return 0;
		}
        return answer;
	}
	public static void main(String[] args) {
		String e[] = {"H", "T", "H", "T", "H", "T", "H"};
		String a[] = {"T", "T", "H", "H", "T", "T", "H"};
		new Solution3().solution(1000, e, a);
	}
}
