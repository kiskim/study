package exam.exam_test7;

public class Solution1 {
    public int solution(String[] grades, int[] weights, int threshold) {
		int score = 0;
		for(int i = 0; i < grades.length; i++)
		{
			switch(grades[i])
			{
				case "A+": score += weights[i] * 10; break;
				case "A0": score += weights[i] * 9; break;
				case "B+": score += weights[i] * 8; break;
				case "B0": score += weights[i] * 7; break;
				case "C+": score += weights[i] * 6; break;
				case "C0": score += weights[i] * 5; break;
				case "D+": score += weights[i] * 4; break;
				case "D0": score += weights[i] * 3; break;
				default: score += 0;break;
			}
		}
        return score - threshold;
	}
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String g[] = {"A+","D+","F","C0"};
		int w[] = {2,5,10,3};
		s.solution(g, w, 50);
	}
}
