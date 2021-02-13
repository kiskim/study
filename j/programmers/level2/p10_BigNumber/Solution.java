package programmers.level2.p10_BigNumber;

public class Solution {

	// 순열 알고리즘을 이용해 재귀 방식의 풀이
	public String permFunc(int [] arr, int depth, int r, String number)
	{
		String res = "";
		String temp;
		if(depth == r)
		{
			String s = "";
			char [] n = number.toCharArray();
			for(int i = 0; i < r; i++)
				n[arr[i]] = 0;
			for(char c : n)
				if (c != 0)
					s += c;
			return s;
		}
		for (int i = depth; i < arr.length; i++)
		{
			swap(arr, depth, i);
			temp = permFunc(arr, depth + 1, r, number);
			swap(arr, depth, i);
			res = res.compareTo(temp) > 0 ? res : temp;
		}
		return res;
	}

	private void swap(int[] arr, int a, int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public String solution(String number, int k) {
		String res = "";
		int [] n = new int[number.length()];
		for(int i = 0; i < number.length(); i++)
			n[i] = i;
		res += permFunc(n, 0, k,  number);
        return res;
	}
	// 시작 지점부터 최대값을 탐색하는 방식
	public String solution2(String number, int k)
	{
		
		StringBuilder sb = new StringBuilder("");
		int maxIdx = 0;
		int start = 0;
		int len = number.length() - k;
		char maxChr = 0;
		char [] n = number.toCharArray();
		// 남은 길이가 0보다 클 경우만 실행
		while (len > 0)
		{
			// 문자 하나 탐색이므로 남은 길이 -1
			len--;
			// 이전 탐색한 곳 다음 부터 시작
			// 현재 인덱스에서 앞으로 탐색이 필요한 len만큼 남을 때 까지의 최대값 확인
			for(int i = start; i + len < n.length; i++)
			{
				if (n[i] > maxChr)
				{
					maxChr = n[i];
					maxIdx = i;
				}
			}
			sb.append(String.valueOf(maxChr));
			start = maxIdx + 1;
			maxIdx = 0;
			maxChr = 0;
		}
		return sb.toString();
	}

	public String solution3(String number, int k){
		StringBuilder sb = new StringBuilder();
		char [] num = number.toCharArray();
		char max = 0;
		int maxIdx = 0;
		int cnt = number.length() - k;
		int start = 0;
		while(cnt > 0){
			cnt--;
			for(int idx = start; idx + cnt < number.length(); idx++){
				if (num[idx] > max){
					max = num[idx];
					maxIdx = idx;
				}
			}
			sb.append(num[maxIdx]);
			start = maxIdx + 1;
			max = 0;
		}
		return sb.toString();
	}


	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution3("1924", 2));
		System.out.println(s.solution3("1231234", 3));
		System.out.println(s.solution3("4177252841", 4));
	}
}
