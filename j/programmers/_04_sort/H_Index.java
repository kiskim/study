package programmers._04_sort;

import java.util.Arrays;

public class H_Index {

    public int solution(int[] citations) {
		int answer = 0;
		int temp;
		Arrays.sort(citations);
		for(int i = 0; i < citations.length; i++)
		{
			temp = 0;
			for(int j = 0; j < citations.length; j++)
			{
				if(i <= citations[j])
					temp++;
			}
			if(citations.length - temp <= i && i <= temp)
				answer = temp;
		}
        return answer;
	}
	
	public static void main(String[] args) {
		H_Index h = new H_Index();
		int [] c = {20,21,22,23};
		int a = h.solution(c);
		System.out.println(a+"");
	}
}