package exam._02_;

import java.util.LinkedList;
import java.util.Queue;

public class 트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
		int time = 0;
		int index = 0;
		int tot_weight = 0;
		Queue<Integer> bridge = new LinkedList<Integer>();
		Queue<Integer> t = new LinkedList<Integer>();
		while(index < truck_weights.length || bridge.peek() != null)
		{
			time++;
			if(t.peek() != null && time - t.peek() == bridge_length)
			{
				tot_weight -= bridge.poll();
				t.poll();
			}
			if(index < truck_weights.length && tot_weight + truck_weights[index] <= weight)
			{
				tot_weight += truck_weights[index];
				bridge.add(truck_weights[index]);
				t.add(time);
				index++;
			}
		}
        return time;
	}
	
	public static void main(String[] args) {
		트럭 t = new 트럭();
		int [] w = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		System.out.println(t.solution(100, 100, w));
	}
}