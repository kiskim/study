package programmers.level1.p21_hateSameNum;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public int[] solution(int []arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int temp = -1;
		for(int a : arr)
			if(temp != a){
				list.add(a);
				temp = a;
			}
        return list.stream().mapToInt(Integer::intValue).toArray();
	}
	public int[] solution2(int []arr){
		int [] answer = null;
		Stack<Integer> st = new Stack<Integer>();
		st.push(arr[0]);
		for(int i = 1; i < arr.length; i++){
			if(st.peek() != arr[i])
				st.push(arr[i]);
		}
		answer = new int[st.size()];
		for(int i = answer.length - 1; i > -1; i--)
			answer[i] = st.pop();
		return answer;
	}

	public int[] solution3(int []arr){
		int [] answer = null;
		int preNum = -1;
		ArrayList<Integer> list = new ArrayList<>();
		for(int n : arr){
			if(preNum != n){
				list.add(n);
				preNum = n;
			}
		}
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++)
			answer[i] = list.get(i);
		return answer;
	}
}
