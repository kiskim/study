import java.io.*;

class main02 {
	public static int cnt(char [] place, int idx, int n){
		int res = 0;
		if (idx == n)
			return 1;
		else if (idx > n || place[idx] == '0')
			return 0;
		res += cnt(place, idx + 1, n);
		res += cnt(place, idx + 2, n);
		return res;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char [] place = br.readLine().toCharArray();
		int res = cnt(place, 0, n - 1);
		System.out.println(res);
	}
}