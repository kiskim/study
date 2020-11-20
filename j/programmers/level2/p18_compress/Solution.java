package programmers.level2.p18_compress;

public class Solution {
	public class Status{
		int z;
		int o;

		public void setCnt(int i){
			if (i == 0)
				z++;
			else
				o++;
		}
	}
    public int[] solution(int[][] arr) {
		Status s = new Status();
		compress(0, 0, arr.length, arr, s);
		int[] answer = {s.z, s.o};
        return answer;
	}

	public void compress(int x, int y, int len, int[][] arr, Status s){
		int num = arr[x][y];
		for(int i = x; i < x + len; i++){
			for (int j = y; j < y + len; j++){
				if (num != arr[i][j]){
					compress(x, y, len / 2, arr, s);
					compress(x, y + len / 2, len / 2, arr, s);
					compress(x + len / 2, y, len / 2, arr, s);
					compress(x + len / 2, y + len / 2, len / 2, arr, s);
					return;
				}
			}
		}
		s.setCnt(num);
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		int [][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		s.solution(arr);
	}
}
