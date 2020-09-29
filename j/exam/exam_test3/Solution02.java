package exam.exam_test3;

public class Solution02 {
	public int[] solution(String[] S) {
		int [] res = null;
		for(int i = 0; i < S.length; i++)
		{
			for(int j = 0; j <S.length; j++)
			{
				if(i != j)
				{
					for(int k = 0; k < S[i].length(); k++)
					{
						if(S[i].charAt(k) == S[j].charAt(k))
						{
							res = new int[3];
							res[0] = i;
							res[1] = j;
							res[2] = k;
							break;
						}
					}
				}
				if(res != null)
					break;
			}
			if(res != null)
			break;
		}
		if(res == null)
			res = new int[3];
		return res;
    }
}
