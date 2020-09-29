package exam.exam_test3;

public class Solution03 {
    public int solution(int[] A) {
		int res = 0;
		int zeroIdx = 0;
		int Idx = 0;
		int countIdx = 0;
		int [] count = new int[A.length+1];
		for(int a : A)
			count[a]++;
		for(int i = 1; i <= A.length; i++)
		{
			if(count[i] == 0)
				zeroIdx = i;
			else if(count[i] > 1){
				Idx = i;
				countIdx = count[i];
			}
			if(zeroIdx > 0 && countIdx > 1)
			{
				res += Math.abs(Idx - zeroIdx);
				countIdx--;
				zeroIdx = 0;
			}
		}
		return res;
    }
}
