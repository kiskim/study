
import java.io.*;
import java.util.Arrays;
class main03 {
	public static int check(char [][] input,int x, int y, int box, int n)
	{
		int res = 1;
		if (x + box > n || y + box > n)
			return 0;
		for(int j = x; j < x + box; j++)
			for(int k = y; k < y + box ; k++)
				if (j > n || k > n || input[j][k] == '0')
					return 0;
		return res;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt[] = new int[n];
		int tot = 0;
		char input[][] = new char [n][n];
		Arrays.fill(cnt, 0);
		for(int i = 0; i < n; i++)
			input[i] = br.readLine().toCharArray();
		for(int i = 1; i < n; i++)
		{
			for(int j = 0; j < n; j++)
				for(int k = 0; k < n; k++)
					cnt[i - 1] += check(input, j, k, i, n);
		}
		for(int a: cnt)
			tot += a;
		System.out.println("total: "+tot);
		for(int i = 0; i < n; i++)
			if(cnt[i] != 0)
				System.out.println("size["+(i + 1)+"]: "+cnt[i]);
	}
}