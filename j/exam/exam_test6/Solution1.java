package exam.exam_test6;

public class Solution1 {
	public int [] solution(int money){
		int [] res = new int[9];
		int p [] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		for (int i = 0; i < 9; i++)
		{
			res[i] = money / p[i];
			money = money % p[i];
		}
		return res;
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		s.solution(1500);
	}
}
