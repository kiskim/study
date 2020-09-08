package programmers._04_sort;

import java.util.Arrays;

public class H_Index {

    public int solution(int[] citations) {
		int answer = 0;
		int temp;
		Arrays.sort(citations);
		for(int i = 0; i < citations.length; i++)
		{
			temp = citations.length - i;
			if(citations[i] >= temp){
				answer = temp;
				break;
			}
		}
        return answer;
	}
	
	public static void main(String[] args) {
		H_Index h = new H_Index();
		int [] c = {1, 2, 2, 2, 2};
		int a = h.solution(c);
		System.out.println(a+"");
	}
}