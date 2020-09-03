package programmers._03_heap;

import java.util.TreeSet;

public class hot {
    public int solution(int[] scoville, int K) {
		int answer = 0;
		int count = 0;
		int temp = 0;
		int min1, min2;
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int a : scoville)
			tree.add(a);
		if(tree.last() == 0)
			return -1;
		while(tree.first() < K)
		{
			answer++;
			count = 0;
			min1 = tree.pollFirst();
			while(tree.first() == min1)
			{
				tree.pollFirst();
				count++;
			}
			min2 = tree.pollFirst();
			while(tree.first() == min2)
			{
				tree.pollFirst();
				count++;
			}
			temp = min1 + min2 + min2;
			while(count-- >0)
				tree.add(temp);
		}
        return answer;
	}
	
	public static void main(String[] args) {
		hot h = new hot();
		int [] i = {0, 0, 0, 1};
		int res = h.solution(i, 7);
		System.out.println(res);
	}
}