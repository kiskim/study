package _00_;

public class _02 {
	public static int solution(String answer_sheet, String [] sheets)
	{
		int answer = 0;
		int len, top_len, count, res;
		boolean pre;
		for(int i = 0; i < sheets.length; i++ )
		{
			for(int j = i + 1; j < sheets.length; j++)
			{
				len = 0;
				count = 0;
				res = 0;
				top_len = 0;
				pre = false;
				for(int k = 0; k < answer_sheet.length(); k++)
				{
					if(sheets[i].charAt(k) != answer_sheet.charAt(k)
						&& sheets[i].charAt(k) == sheets[j].charAt(k))
					{
						count++;
						if(pre)
							len++;
						else{
							pre = true;
							len = 1;
						}
						top_len = len > top_len ? len : top_len;
					}
					else
						pre = false;
				}
				res = count + top_len * top_len;
				answer = res > answer ? res : answer;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String [] answer_sheet = {"4132315142" , "53241" , "24551" };
		String [][] sheets = {
			{"3241523133","4121314445","3243523133","4433325251","2412313253"} ,
			{"53241", "42133", "53241", "14354"},
			{"24553", "24553", "24553", "24553"}
		};

		for(int i = 0; i < answer_sheet.length; i++)
		{
			System.out.println(i+" "+solution(answer_sheet[i], sheets[i]));
		}
	}
}
