package programmers.level1.p31_min;

public class Main {
    public int[] solution(int[] arr) {
		int[] answer = null;
		int min = arr[0];
		int count = 0;
		if(arr.length <= 1){
			answer = new int[1];
			answer[0] = -1;
		}
		else
		{
			for(int a : arr){
				if(min > a){
					min = a;
					count = 0;
				}
				if(min == a)
					count++;
			}
			answer = new int[arr.length - count];
			int i = 0;
			for(int a : arr)
				if(a != min)
					answer[i++] = a; 
		}
        return answer;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		int [] i = {2,3,4,5,1, 1,6,7};
		int [] res = m.solution(i);
		for(int a : res)
			System.out.println(a+" ");
	}
}
