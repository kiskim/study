package exam._03_heap;

import java.util.PriorityQueue;

public class hot {
    public int solution(int[] scoville, int K) {
		if(scoville.length <= 1)
			return -1;
		int answer = 0;
		int min1 = 0, min2 = 0, temp = 0;
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int a : scoville)
			q.add(a);
		while(q.size() > 1 && q.peek() < K)
		{
			answer++;
			min1 = q.poll();
			while(!q.isEmpty() && q.peek() == 0)
				q.poll();
			min2 = q.isEmpty() ? min1 : q.poll();
			if(min1 == 0 && min2 == 0)
				return -1;
			temp = min1 + min2 + min2;
			q.add(temp);
		}
		return q.peek() > K ? answer : -1;
	}
	
	public static void main(String[] args) {
		hot h = new hot();
		int [] i = {0, 0, 0, 1};
		int res = h.solution(i, 7);
		System.out.println(res);
	}
}