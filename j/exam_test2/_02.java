package exam_test2;

import java.util.ArrayList;
import java.util.LinkedList;

public class _02 {
    public int[] solution(int[] ball, int[] order) {
		int[] answer;
		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> wait = new LinkedList<>();
		ArrayList<Integer> res = new ArrayList<>();
		for(int a : ball)
			list.add(a);
		for(int o : order)
			wait.add(o);
		int i = 0;
		while(wait.size() > 0)
		{
			if(list.peek() == wait.get(i)){
				res.add(list.poll());
				wait.remove(i);
				i = 0;
			}
			else if(list.peekLast() == wait.get(i)){
				res.add(list.pollLast());
				wait.remove(i);
				i = 0;
			}
			else
				i++;
		}
		answer = new int[res.size()];
		for(int j = 0; j < res.size(); j++)
			answer[j] = res.get(j);
        return answer;
	}
	
	public static void main(String[] args) {
		_02 test = new _02();
		int [] ball = {1, 2, 3, 4, 5, 6};
		int [] order = {6, 2, 5, 1, 4, 3};
		test.solution(ball, order);
	}
}
