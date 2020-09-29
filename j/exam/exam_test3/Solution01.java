package exam.exam_test3;

public class Solution01 {
    public int solution(String S) {
		int res = 0;
		int countA = 0;
		for(int i = 0; i < S.length(); i++)
		{
			if(S.charAt(i) == 'a')
				countA++;
			else if(i < S.length())
			{
				res += 2 - countA;
				countA = 0;
			}
			if(countA > 2){
				res = -1;
				break;
			}

		}
		if(res > 0)
			res += 2 - countA; 
		return res;
	}
}
