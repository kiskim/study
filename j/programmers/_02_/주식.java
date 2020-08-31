package programmers._02_;

	import java.util.Arrays;

public class 주식 {
    public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int temp;
		Arrays.fill(answer, 0);
		for(int i = 0;  i < prices.length - 1;i++)
		{
			temp = 0;
			for(int j = i + 1; j < prices.length; j++ )
			{
				temp++;
				if(prices[i] > prices[j])
					break;
			}
			answer[i] = temp;
		}
        return answer;
	}
	
	public static void main(String[] args) {
		int [] t = {1, 2, 3, 2, 3};
		for(int a : solution(t))
		{
			System.out.print(a+" ");
		}
	}
}