package programmers.level1.p37_map;

public class Main {
    public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		int [] sum = new int[n];
		for(int i = 0; i < n; i++)
			sum[i] = arr1[i] | arr2[i];
		int i = 0;
		for(int num : sum)
		{
			answer[i]="";
			int count = 0;
			while(num > 0)
			{
				int temp = num % 2;
				num = num >> 1;
				answer[i] = (temp == 0 ? " " : "#")+answer[i];
				count++;
			}
			if(count < n)
				for(int j = count; j < n; j++)
					answer[i] = " "+answer[i];
			i++;
		}
        return answer;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		int [] arr1 = {46, 33, 33 ,22, 31, 50};
		int [] arr2 = {27 ,56, 19, 14, 14, 10};
		String [] s = m.solution(6, arr1, arr2);
		for(String c: s)
		{
			System.out.println("|"+c+"|");
		}
	}
}
